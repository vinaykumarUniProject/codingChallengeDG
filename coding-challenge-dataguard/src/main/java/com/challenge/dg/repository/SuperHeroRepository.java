package com.challenge.dg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.dg.model.SuperHero;

@Repository
public interface SuperHeroRepository extends JpaRepository<SuperHero, Long>{

}
