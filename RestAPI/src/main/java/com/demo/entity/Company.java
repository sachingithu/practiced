package com.demo.entity;



public class Company {

	private String name;
	private String location;
	private Double turnOver;
	private String category;
	public Company(String name, String location, Double turnOver, String category) {
		super();
		this.name = name;
		this.location = location;
		this.turnOver = turnOver;
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(Double turnOver) {
		this.turnOver = turnOver;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + ", turnOver=" + turnOver + ", category=" + category
				+ "]";
	}
	
	
}
