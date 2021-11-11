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
@Table(name= "association")
@NoArgsConstructor
@Data
public class Association {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long aId;
	
	@NotNull
	private String name;
	private String description;
	
	public Association(String name, String description) {
		this.name = name;
		this.description = description;
	}

}
