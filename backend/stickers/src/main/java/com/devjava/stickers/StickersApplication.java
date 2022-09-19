package com.devjava.stickers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devjava.stickers.entities.Collections;
import com.devjava.stickers.repositories.CollectionsRepository;

@SpringBootApplication
public class StickersApplication implements CommandLineRunner {

	@Autowired
	private CollectionsRepository collectionRepository;

	public static void main(String[] args) {
		SpringApplication.run(StickersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		String code = "A1";

		System.out.println("Lista do(s) colecionadores que possuem a figurinha " + code + " :");
		List<Collections> result1 = collectionRepository.searchCollection(code);
		for (Collections collection : result1) {
			System.out.println(collection);
		}

	}

}
