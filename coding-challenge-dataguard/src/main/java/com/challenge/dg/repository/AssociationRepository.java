package com.challenge.dg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.dg.model.Association;

@Repository
public interface AssociationRepository extends JpaRepository<Association, Long>{

}
