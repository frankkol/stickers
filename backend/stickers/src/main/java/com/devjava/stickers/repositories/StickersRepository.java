package com.devjava.stickers.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devjava.stickers.entities.Stickers;

public interface StickersRepository extends JpaRepository<Stickers, Long>{
	
	@Query("SELECT st FROM Collections cl JOIN cl.itensCollections it JOIN it.stickers st WHERE cl.name LIKE %:name%")
    public List<Stickers> searchCollection(String name);
	
	@Query("SELECT st FROM Stickers st WHERE st.code = :code")
    public Page<Stickers> findByCode(String code, Pageable pageable);
	
}
