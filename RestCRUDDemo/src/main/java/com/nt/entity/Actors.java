package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Actors {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String category;
	private Long mobno;
	
	public Actors() {
		super();
	}
	public Actors(Integer id, String name, String category, Long mobno) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.mobno = mobno;
	}
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Long getMobno() {
		return mobno;
	}
	public void setMobno(Long mobno) {
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "Actors [id=" + id + ", name=" + name + ", category=" + category + ", mobno=" + mobno + "]";
	}
	
	
}
