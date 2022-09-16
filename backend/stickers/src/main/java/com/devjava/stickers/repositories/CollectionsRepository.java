package com.devjava.stickers.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devjava.stickers.entities.Collections;

public interface CollectionsRepository extends JpaRepository<Collections, Long>{
	 
	 @Query("SELECT cl FROM Collections cl JOIN cl.itensCollections it JOIN it.stickers st WHERE st.code LIKE %:code%")
	 public List<Collections> searchCollection(String code);

}
