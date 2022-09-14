package com.devjava.stickers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjava.stickers.entities.Stickers;

public interface StickersRepository extends JpaRepository<Stickers, Long>{

}
