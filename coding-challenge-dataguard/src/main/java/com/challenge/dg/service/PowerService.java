package com.challenge.dg.service;

import java.util.List;

import com.challenge.dg.model.Power;

public interface PowerService {

	public Power createPower(Power power);

	public List<Power> getAll();

}
