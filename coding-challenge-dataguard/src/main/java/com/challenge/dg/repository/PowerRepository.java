package com.challenge.dg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.dg.model.Power;

@Repository
public interface PowerRepository extends JpaRepository<Power, Long> {

}
