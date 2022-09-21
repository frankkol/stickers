package com.devjava.stickers.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devjava.stickers.entities.Countries;

public interface CountriesRepository extends JpaRepository<Countries, Long>{
	
	@Query("SELECT ct FROM Countries ct WHERE ct.thophiesNumbers > 0 ORDER BY ct.thophiesNumbers DESC")
    public Page<Countries> findByChampions(Pageable pageable);

}
