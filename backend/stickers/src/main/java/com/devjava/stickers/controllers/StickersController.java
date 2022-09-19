package com.devjava.stickers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devjava.stickers.entities.Stickers;
import com.devjava.stickers.services.StickersService;

@RestController
public class StickersController {

	@Autowired
	private StickersService service;
	
	@GetMapping
	@RequestMapping(value = "/stickers")
	public Page<Stickers> findStickers(
			@RequestParam(value="code", defaultValue = "")String code,
			Pageable pageable) {
		return service.findStickers(code, pageable);
	}
	
	@GetMapping
	@RequestMapping(value = "/collection")
	public Page<Stickers> findStickersByCollection(
			@RequestParam(value="name", defaultValue = "")String name,
			Pageable pageable) {
		return service.searchCollection(name, pageable);
	}
	
}
