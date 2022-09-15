package com.devjava.stickers.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_itens_collections")
public class ItensCollections {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "collections_id")
	private Collections colections;
	
	@ManyToOne
	@JoinColumn(name = "stickers_id")
	private Stickers stickers;
	
	public ItensCollections() {
		
	}

	public ItensCollections(Long id, Collections colections, Stickers stickers) {
		super();
		this.id = id;
		this.colections = colections;
		this.stickers = stickers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Collections getColections() {
		return colections;
	}

	public void setColections(Collections colections) {
		this.colections = colections;
	}

	public Stickers getStickers() {
		return stickers;
	}

	public void setStickers(Stickers stickers) {
		this.stickers = stickers;
	}

	@Override
	public String toString() {
		return "ItensCollections [id=" + id + ", colections=" + colections + ", stickers=" + stickers + "]";
	}
	
}
