package com.smartphone.controller;
import java.util.*;
import com.smartphone.model.*;
import java.util.Scanner;

public class SmartPhoneController {
	
	public ArrayList<SmartPhoneModel> smartphoneList = new ArrayList<>();
	public Scanner input;
	
	public SmartPhoneModel phoneDetails() {
		input = new Scanner(System.in);
		
		System.out.print("Enter id of the product: ");
		int id = input.nextInt();
		
		System.out.println("Enter name of the product: ");
		String name = input.nextLine();
		
		System.out.println("Enter brand of the product: ");
		String brand  = input.nextLine();
		
		System.out.println("Enter color of the product: ");
		String color = input.nextLine();
		
		System.out.print("Enter price of the product: ");
		float price = input.nextFloat();

		SmartPhoneModel smartphone = new SmartPhoneModel( id, name, brand, color, price);
		return smartphone;
	}
	
	public void addPhone() {
		smartphoneList.add(phoneDetails());
	 }

	public void display() {
		for(SmartPhoneModel item: smartphoneList) {
			System.out.print(item.getId() + item.getName() + item.getBrand() + item.getColor() + item.getPrice());
		}
	}
	
}

