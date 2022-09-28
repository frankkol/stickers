package com.devjava.stickers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devjava.stickers.entities.Stickers;
import com.devjava.stickers.repositories.StickersRepository;

@Service
public class StickersService {
	
	@Autowired
	private StickersRepository repository;
	
	public Page<Stickers> findStickers(String code, Pageable pageable) {
		
		if(code.isEmpty()) {
			return repository.findAll(pageable); 
		}
		
		return repository.findByCode(code, pageable); 
	}
	
	public Page<Stickers> searchCollection(String name, Pageable pageable) {
		if(name.isEmpty()) {
			return null; 
		}
		return repository.searchCollection(name, pageable);
	}

	public void insert(Stickers sticker) {
		repository.save(sticker);
	}

}
