package com.devjava.stickers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devjava.stickers.entities.Collections;
import com.devjava.stickers.services.CollectionsService;

@RestController
public class CollectionsController {
	
	@Autowired
	private CollectionsService service;
	
	@GetMapping
	@RequestMapping(value = "/collections")
	public Page<Collections> findAll(
			@RequestParam(value="stickerCode", defaultValue = "")String stickerCode,
			Pageable pageable) {
		return service.findAll(stickerCode, pageable);
	}
	
	@PostMapping
	@RequestMapping(value = "/collections", method = RequestMethod.POST, consumes="application/json")
	public void insert(@RequestBody Collections collection, Model model) {
		service.insert(collection);
	}
}
