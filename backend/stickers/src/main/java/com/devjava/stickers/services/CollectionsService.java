package com.devjava.stickers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devjava.stickers.entities.Collections;
import com.devjava.stickers.entities.ItensCollections;
import com.devjava.stickers.entities.Stickers;
import com.devjava.stickers.repositories.CollectionsRepository;
import com.devjava.stickers.repositories.ItensCollectionsRepository;
import com.devjava.stickers.repositories.StickersRepository;

@Service
public class CollectionsService {
	
	@Autowired
	private CollectionsRepository repository;
	
	@Autowired
	private StickersRepository stRepostitory;
	
	@Autowired
	private ItensCollectionsRepository itRepository;
	
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

	public void addCollection(String id, String stickerId) {
		if (id.isEmpty() || stickerId.isEmpty()) {
			System.out.println("Required parameters not informed!");
		}else {
			Long idLong = Long.parseLong(id);
			Long idSticker = Long.parseLong(stickerId);
			
			try {
				@SuppressWarnings("deprecation")
				Collections cl = repository.getOne(idLong);
				@SuppressWarnings("deprecation")
				Stickers st = stRepostitory.getOne(idSticker);
				
				ItensCollections it = new ItensCollections(null, cl, st);			
				itRepository.save(it);	
			} catch (Exception e) {
				System.out.println("Colection or Stickers not found!");
				System.out.println(e);
			}
		}
	}
	
	

}
