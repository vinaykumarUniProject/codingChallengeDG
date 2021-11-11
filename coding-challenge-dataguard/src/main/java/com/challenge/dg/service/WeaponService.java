package com.challenge.dg.service;

import java.util.List;

import com.challenge.dg.model.Weapon;

public interface WeaponService {

	public Weapon createWeapon(Weapon weapon);

	public List<Weapon> getAll();

}
