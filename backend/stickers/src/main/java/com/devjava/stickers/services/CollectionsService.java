package com.devjava.stickers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devjava.stickers.entities.Collections;
import com.devjava.stickers.repositories.CollectionsRepository;

@Service
public class CollectionsService {
	
	@Autowired
	private CollectionsRepository repository;
	
	public Page<Collections> findAll(String stickerCode, Pageable pageable) {
		
		if(stickerCode.isEmpty()) {
			return repository.findAll(pageable);
		}else {
			return repository.findCollectionsBySticker(stickerCode, pageable);
		}
	}
	
	public void insert(Collections collection) {
		repository.save(collection);
	}

}
