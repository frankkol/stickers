package com.devjava.stickers.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_stickers")
public class Stickers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
	private String playerName;
	private Double playerHeigth;
	private Double playerWeight;
	private String playerBirthDate;
	
	@ManyToOne
	@JoinColumn(name = "countries_id")
	private Countries countries;
	
	public Stickers() {
		
	}

	public Stickers(Long id, String code, String playerName, Double playerHeigth, Double playerWeight,
			String playerBirthDate, Countries countries) {
		super();
		this.id = id;
		this.code = code;
		this.playerName = playerName;
		this.playerHeigth = playerHeigth;
		this.playerWeight = playerWeight;
		this.playerBirthDate = playerBirthDate;
		this.countries = countries;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Double getPlayerHeigth() {
		return playerHeigth;
	}

	public void setPlayerHeigth(Double playerHeigth) {
		this.playerHeigth = playerHeigth;
	}

	public Double getPlayerWeight() {
		return playerWeight;
	}

	public void setPlayerWeight(Double playerWeight) {
		this.playerWeight = playerWeight;
	}

	public String getPlayerBirthDate() {
		return playerBirthDate;
	}

	public void setPlayerBirthDate(String playerBirthDate) {
		this.playerBirthDate = playerBirthDate;
	}

	public Countries getCountries() {
		return countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}

	@Override
	public String toString() {
		return "Stickers [id=" + id + ", code=" + code + ", playerName=" + playerName + ", playerHeigth=" + playerHeigth
				+ ", playerWeight=" + playerWeight + ", playerBirthDate=" + playerBirthDate + ", countries=" + countries
				+ "]";
	}

}
