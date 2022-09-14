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
	private int thophies_numbers;

	public Countries() {

	}

	public Countries(Long id, String name, int thophies_numbers) {
		super();
		this.id = id;
		this.name = name;
		this.thophies_numbers = thophies_numbers;
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

	public int getThophies_numbers() {
		return thophies_numbers;
	}

	public void setThophies_numbers(int thophies_numbers) {
		this.thophies_numbers = thophies_numbers;
	}

	@Override
	public String toString() {
		return "Countries [id=" + id + ", name=" + name + ", thophies_numbers=" + thophies_numbers + "]";
	}

}
