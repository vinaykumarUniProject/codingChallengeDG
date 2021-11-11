package com.challenge.dg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="weapon")
@NoArgsConstructor
@Data
public class Weapon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long wId;
	
	@NotNull
	private String name;
	
	private String description;
	
	public Weapon(String name, String description) {
		this.name = name;
		this.description = description;
	}
}
