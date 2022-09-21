package com.devjava.stickers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devjava.stickers.entities.Countries;
import com.devjava.stickers.repositories.CountriesRepository;

@Service
public class CountriesService {

	@Autowired
	private CountriesRepository repository;

	public Page<Countries> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	public Page<Countries> findByChampions(Pageable pageable) {
		return repository.findByChampions(pageable);
	}
}
