package com.challenge.dg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.dg.model.Association;
import com.challenge.dg.service.AssociationService;

@RestController
public class AssociationController {

	@Autowired
	private AssociationService associationService;
	
	@GetMapping("/assoications")
	public ResponseEntity<List<Association>> getAllAssociations(){
		return ResponseEntity.ok().body(associationService.getAll());
	}
	
	@PostMapping("/assoication")
	public ResponseEntity<Association> createAssociation(@RequestBody Association association){
		return ResponseEntity.ok().body(this.associationService.createAssociation(association));
	}
	
}
