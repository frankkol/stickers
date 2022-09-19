package com.devjava.stickers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devjava.stickers.entities.Stickers;
import com.devjava.stickers.repositories.StickersRepository;

@Service
public class StickersService {
	
	@Autowired
	private StickersRepository repository;
	
	public List<Stickers> findStickers() {
		return repository.findAll(); 
	}

}
