package com.challenge.dg.service;

import java.util.List;

import com.challenge.dg.model.Association;

public interface AssociationService {

	public Association createAssociation(Association association);

	public List<Association> getAll();

}
