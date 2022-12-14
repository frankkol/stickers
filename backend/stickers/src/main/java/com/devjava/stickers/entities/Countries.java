package com.devjava.stickers.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_countries")
public class Countries {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Long thophiesNumbers;

	public Countries() {

	}

	public Countries(Long id, String name, Long thophiesNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.thophiesNumbers = thophiesNumbers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getThophies_numbers() {
		return thophiesNumbers;
	}

	public void setThophies_numbers(Long thophiesNumbers) {
		this.thophiesNumbers = thophiesNumbers;
	}

	@Override
	public String toString() {
		return "Countries [id=" + id + ", name=" + name + ", thophies_numbers=" + thophiesNumbers + "]";
	}

}
