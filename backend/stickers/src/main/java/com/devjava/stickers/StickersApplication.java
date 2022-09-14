package com.devjava.stickers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devjava.stickers.entities.Stickers;
import com.devjava.stickers.repositories.StickersRepository;

@SpringBootApplication
public class StickersApplication implements CommandLineRunner{

	@Autowired
	private StickersRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(StickersApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Lista todas as figuras:");
		List<Stickers> result = repository.findAll();
		for (Stickers sticker : result) {
			System.out.println(sticker);
		}
		
	}
	

}
