package com.challenge.dg.service;

import java.util.List;

import com.challenge.dg.model.SuperHero;

public interface SuperHeroService {

	public SuperHero createSuperHero(SuperHero superHero);

	public List<SuperHero> getAll();

}
