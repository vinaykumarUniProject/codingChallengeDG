package com.challenge.dg.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.dg.model.SuperHero;
import com.challenge.dg.repository.SuperHeroRepository;
import com.challenge.dg.service.SuperHeroService;

@Service
@Transactional
public class SuperHeroServiceImpl implements SuperHeroService {

	@Autowired
	private SuperHeroRepository superHeroRepository;

	@Override
	public SuperHero createSuperHero(SuperHero superHero) {
		return this.superHeroRepository.save(superHero);
	}

	@Override
	public List<SuperHero> getAll() {
		return this.superHeroRepository.findAll();
	}

}
