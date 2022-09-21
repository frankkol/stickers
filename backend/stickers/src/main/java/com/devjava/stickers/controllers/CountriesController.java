package com.devjava.stickers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devjava.stickers.entities.Countries;
import com.devjava.stickers.services.CountriesService;

@RestController
public class CountriesController {
	
	@Autowired
	private CountriesService service;
	
	@GetMapping
	@RequestMapping(value = "/countries")
	public Page<Countries> findAll(Pageable pageable) {
		return service.findAll(pageable);
	}
	
	@GetMapping
	@RequestMapping(value = "/countries/champions")
	public Page<Countries> findByChampions(Pageable pageable) {
		return service.findByChampions(pageable);
	}

}
