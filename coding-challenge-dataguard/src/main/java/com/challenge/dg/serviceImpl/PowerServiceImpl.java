package com.challenge.dg.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.dg.model.Power;
import com.challenge.dg.repository.PowerRepository;
import com.challenge.dg.service.PowerService;

@Service
public class PowerServiceImpl implements PowerService {
	
	@Autowired
	private PowerRepository powerRepository;

	@Override
	public Power createPower(Power power) {
		return this.powerRepository.save(power);
	}

	@Override
	public List<Power> getAll() {
		return this.powerRepository.findAll();
	}

}
