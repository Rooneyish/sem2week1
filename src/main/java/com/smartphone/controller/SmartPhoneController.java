package com.smartphone.controller;
import java.util.*;
import com.smartphone.model.*;
import java.util.Scanner;

public class SmartPhoneController {
	
	public ArrayList<SmartPhoneModel> smartphoneList = new ArrayList<>();
	public Scanner input;
	
	public SmartPhoneModel phoneDetails() {
		input = new Scanner(System.in);
		
		System.out.print("Enter Model of the product: ");
		String model = input.next();
		input.nextLine();
		
		System.out.print("Enter Brand of the product: ");
		String brand  = input.next();
		input.nextLine();
		
		System.out.print("Enter Processor of the product: ");
		String processor= input.next();
		input.nextLine();
		
		System.out.print("Enter Ram of the product: ");
		int ram= input.nextInt();
		input.nextLine();
		
		System.out.print("Enter Storage of the product: ");
		int storage= input.nextInt();
		input.nextLine();
		
		System.out.print("Enter price of the product: ");
		float price = input.nextFloat();
		input.nextLine();
		
		SmartPhoneModel smartphone = new SmartPhoneModel(model, brand, processor, ram, storage, price);
		return smartphone;
	}
	
	public void addPhone() {
		smartphoneList.add(phoneDetails());
	 }
	
	public void removePhone() {
		System.out.print("Enter model of the phone to remove: ");
		String model = input.next();
		input.nextLine();
		
		for(int i=0; i<smartphoneList.size();i++) {
			if(smartphoneList.get(i).getModel().equalsIgnoreCase(model)) {
				smartphoneList.remove(i);
			}
		}
	}
	
	public void updatePhone() {
		System.out.print("Enter Model of the phone to remove: ");
		String model = input.next();
		input.nextLine();
		
		do {
			System.out.println("Enter the number that corresponds to the phone property: ");
			System.out.println("1 - Processor");
			System.out.println("2 - Ram");
			System.out.println("3 - Storage");
			System.out.println("4 - Price");
			System.out.println("5 - Exit");
			System.out.print("Enter here: ");
			String property= input.next();
			input.nextLine();
			switch(property) {
			case "1":
				System.out.print("New Processor: ");
				String newProcessor = input.next();
				input.nextLine();
				for(SmartPhoneModel item: smartphoneList) {
					if(item.getModel().equalsIgnoreCase(model)) {
						item.setProcessor(newProcessor);
						return;
					}
				}
			case "2":
				System.out.print("New Ram: ");
				int newRam = input.nextInt();
				input.nextLine();
				for(SmartPhoneModel item: smartphoneList) {
					if(item.getModel().equalsIgnoreCase(model)) {
						item.setRam(newRam);
						return;
					}
				}
			case "3":
				System.out.print("New Storage: ");
				int newStorage= input.nextInt();
				input.nextLine();
				for(SmartPhoneModel item: smartphoneList) {
					if(item.getModel().equalsIgnoreCase(model)) {
						item.setStorage(newStorage);
						return;
					}
				}
			case "4":
				System.out.print("New Price: ");
				float newPrice = input.nextFloat();
				input.nextLine();
				for(SmartPhoneModel item: smartphoneList) {
					if(item.getModel().equalsIgnoreCase(model)) {
						item.setPrice(newPrice);
						return;
					}
				}
			case "5":
				return;
			default:
				System.out.print("Can't find property. ");
			}
		}
		while(true);
	}
	
	
	public void displayOption() {
		do {
			System.out.println("1 - Display All");
			System.out.println("2 - Display Details of a Phone");
			System.out.print("Enter here: ");
			String value = input.next();
			input.nextLine();
			
			switch(value) {
			case "1":
				displayAll();
				return;
			case "2":
				displayPhone();
				return;
			default: 
				System.out.print("Invalid input! Please enter '1' or '2'. ");
			}
		}
		while(true);
	}
	
	public void displayAll() {
		for(SmartPhoneModel item: smartphoneList) {
			System.out.println("Model: "+ item.getModel()+" | Brand: "+ item.getBrand()+" | Processor: "+ item.getProcessor()+ " | Ram: "+ item.getRam()+" | Storage: "+ item.getStorage()+ " | Price: "+ item.getPrice());
		}
	}

	public void displayPhone() {
		System.out.print("Enter Model of the phone to get details: ");
		String model = input.next();
		input.nextLine();
		for(int i=0; i<smartphoneList.size();i++) {
			SmartPhoneModel item = smartphoneList.get(i);
			if(item.getModel().equalsIgnoreCase(model)) {
				System.out.println("Model: "+ item.getModel());
				System.out.println("Brand: "+ item.getBrand());
				System.out.println("Processor: "+ item.getProcessor());
				System.out.println("Ram: "+ item.getRam());
				System.out.println("Storage: "+ item.getStorage());
				System.out.println("Price: "+ item.getPrice());
			}
		}
	}
	
}

