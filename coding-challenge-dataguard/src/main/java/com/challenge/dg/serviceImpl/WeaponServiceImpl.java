package com.challenge.dg.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.dg.model.Weapon;
import com.challenge.dg.repository.WeaponRepository;
import com.challenge.dg.service.WeaponService;

@Service
public class WeaponServiceImpl implements WeaponService {
	
	@Autowired
	private WeaponRepository weaponRepository;

	@Override
	public Weapon createWeapon(Weapon weapon) {
		return this.weaponRepository.save(weapon);
	}

	@Override
	public List<Weapon> getAll() {
		return this.weaponRepository.findAll();
	}

}
