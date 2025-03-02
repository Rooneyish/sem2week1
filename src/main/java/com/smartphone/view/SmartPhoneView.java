package com.smartphone.view;
import java.util.Scanner;
import com.smartphone.controller.*;

public class SmartPhoneView {
	public static void main(String [] arg) {
		
		Scanner input = new Scanner(System.in);
		
		SmartPhoneController smartphoneList = new SmartPhoneController();
		boolean loop = true;
		while(loop) {
			System.out.println("Enter the number that corresponds to the functions.");
			System.out.println("1 - Add New Phone");
			System.out.println("2 - Delete Phone");
			System.out.println("3 - Update Phone");
			System.out.println("4 - View Phone Details");
			System.out.println("5 - Exit");
			System.out.print("Enter here: ");
			String value = input.next();
			
			switch(value) {
				case "1":
					smartphoneList.addPhone();
					break;
				case "2":
					smartphoneList.removePhone();
					break;
				case "4":
					smartphoneList.displayOption();
					break;
				case "5":
					loop=false;
					break;
				default:
					System.out.println("Invalid input! Please enter 'y' or 'n'.");
			}
			
		}
	}
}
