package com.devjava.stickers.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devjava.stickers.entities.Collections;

public interface CollectionsRepository extends JpaRepository<Collections, Long>{
	 
	 @Query("SELECT DISTINCT cl FROM Collections cl JOIN cl.itensCollections it JOIN it.stickers st WHERE st.code = :code")
	 public List<Collections> searchCollection(String code);
	
	 @Query("SELECT DISTINCT cl FROM Collections cl JOIN cl.itensCollections it JOIN it.stickers st WHERE st.code = :stickerCode")
	 public Page<Collections> findCollectionsBySticker(String stickerCode, Pageable pageable);

}
