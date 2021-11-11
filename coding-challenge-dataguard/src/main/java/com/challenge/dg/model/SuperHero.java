package com.challenge.dg.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "superhero")
@NoArgsConstructor
@Data
public class SuperHero {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long sId;
	
	@NotNull
	private String name;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "power_fid", referencedColumnName = "sId")
	private Set<Power> powers = new HashSet<>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "weapon_fid", referencedColumnName = "sId")
	private Set<Weapon> weapons = new HashSet<>();

	private String origin;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "association_fid", referencedColumnName = "sId")
	private Set<Association> associations = new HashSet<>();

	public SuperHero(String name, Set<Power> powers, Set<Weapon> weapons, String origin,
			Set<Association> associations) {
		this.name = name;
		this.powers = powers;
		this.weapons = weapons;
		this.origin = origin;
		this.associations = associations;
	}
	
	public SuperHero(String name, String origin) {
		this.name = name;
		this.origin = origin;
	}

}
