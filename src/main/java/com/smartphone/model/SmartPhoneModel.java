package com.smartphone.model;

public class SmartPhoneModel {
	String name;
	String brand;
	String color;
	int id;
	float price;
	public SmartPhoneModel(int id, String brand, String color,  String name, float price){
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.id = id;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getColor() {
		return this.color;
	}
	public int getId() {
		return this.id;
	}
	public float getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setBrand(String brand) {
		this.brand=brand;
		
	}public void setColor(String color) {
		this.color=color;
		
	}public void setId(int id) {
		this.id=id;
		
	}public void setPrice(float price) {
		this.price=price;
	}
	

}
