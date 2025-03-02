package com.smartphone.model;

public class SmartPhoneModel {
	String model;
	String brand;
	String processor;
	int ram;
	int storage;
	float price;
	public SmartPhoneModel(String model,  String brand, String processor, int ram, int storage,  float price){
		this.model= model;
		this.brand = brand;
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
		this.price = price;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getProcessor() {
		return this.processor;
	}
	
	public int getRam() {
		return this.ram;
	}
	
	public int getStorage() {
		return this.storage;
	}
	public float getPrice() {
		return this.price;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public void setProcessort(String processor) {
		this.processor= processor;	
	}
	
	public void setRam(int ram) {
		this.ram=ram;
	}
	
	public void setStorage(int storage) {
		this.storage=storage;
	}
	
	public void setPrice(float price) {
		this.price=price;
	}
	

}
