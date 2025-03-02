package com.smartphone.view;
import java.util.Scanner;
import com.smartphone.controller.*;

public class SmartPhoneView {
	public static void main(String [] arg) {
		
		Scanner input = new Scanner(System.in);
		
		SmartPhoneController smartphoneList = new SmartPhoneController();
		
		while(true) {
			System.out.print("Add Smartphone? (y/n) ");
			String value = input.next();
			
			switch(value) {
				case "y":
					smartphoneList.addPhone();
					smartphoneList.display();
				case "n":
					break;
			}
			
		}
	}
}
