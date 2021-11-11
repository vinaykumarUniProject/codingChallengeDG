package com.challenge.dg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.dg.model.Weapon;
import com.challenge.dg.service.WeaponService;

@RestController
public class WeaponController {

	@Autowired
	private WeaponService weaponService;
	
	@GetMapping("/weapons")
	public ResponseEntity<List<Weapon>> getAllWeapons(){
		return ResponseEntity.ok().body(weaponService.getAll());
	}
	
	@PostMapping("/weapon")
	public ResponseEntity<Weapon> createWeapon(@RequestBody Weapon weapon){
		return ResponseEntity.ok().body(this.weaponService.createWeapon(weapon));
	}
	
}
