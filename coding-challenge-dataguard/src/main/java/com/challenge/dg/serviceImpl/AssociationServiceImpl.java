package com.challenge.dg.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.dg.model.Association;
import com.challenge.dg.repository.AssociationRepository;
import com.challenge.dg.service.AssociationService;

@Service
public class AssociationServiceImpl implements AssociationService {

	@Autowired
	private AssociationRepository associationRepository;
	
	@Override
	public Association createAssociation(Association association) {
		return this.associationRepository.save(association);
	}

	@Override
	public List<Association> getAll() {
		return this.associationRepository.findAll();
	}

}
