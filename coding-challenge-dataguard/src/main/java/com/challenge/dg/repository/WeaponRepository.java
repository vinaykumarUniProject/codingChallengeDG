package com.challenge.dg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.dg.model.Weapon;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, Long>{

}
