package com.challenge.dg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.dg.model.SuperHero;
import com.challenge.dg.service.SuperHeroService;

@RestController
public class SuperHeroController {

	@Autowired
	private SuperHeroService superHeroService;
	
	@GetMapping("/superHeroes")
	public ResponseEntity<List<SuperHero>> getAllSuperHeroes(){
		return ResponseEntity.ok().body(superHeroService.getAll());
	}
	
	@PostMapping("/superHero")
	public ResponseEntity<SuperHero> createSuperHero(@RequestBody SuperHero superHero){
		return ResponseEntity.ok().body(this.superHeroService.createSuperHero(superHero));
	}
	
}
