package com.challenge.dg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.dg.model.Power;
import com.challenge.dg.service.PowerService;

@RestController
public class PowerController {

	@Autowired
	private PowerService powerService;
	
	@GetMapping("/powers")
	public ResponseEntity<List<Power>> getAllPowers(){
		return ResponseEntity.ok().body(powerService.getAll());
	}
	
	@PostMapping("/power")
	public ResponseEntity<Power> createPower(@RequestBody Power power){
		return ResponseEntity.ok().body(this.powerService.createPower(power));
	}
	
}
