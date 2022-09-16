package com.devjava.stickers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devjava.stickers.entities.Collections;
import com.devjava.stickers.entities.Stickers;
import com.devjava.stickers.repositories.CollectionsRepository;
import com.devjava.stickers.repositories.StickersRepository;

@SpringBootApplication
public class StickersApplication implements CommandLineRunner {

	@Autowired
	private StickersRepository repository;

	@Autowired
	private CollectionsRepository collectionRepository;

	public static void main(String[] args) {
		SpringApplication.run(StickersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		String name = "Frank";
		String code = "A1";

		System.out.println("Lista todas as figurinhas do colecionador " + name + " :");
		List<Stickers> result = repository.searchCollection(name);
		for (Stickers stiker : result) {
			System.out.println(stiker);
		}

		System.out.println("Lista do(s) colecionadores que possuem a figurinha " + code + " :");
		List<Collections> result1 = collectionRepository.searchCollection(code);
		for (Collections collection : result1) {
			System.out.println(collection);
		}

	}

}
