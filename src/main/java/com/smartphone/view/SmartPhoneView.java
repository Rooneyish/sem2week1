package com.smartphone.view;
import java.util.Scanner;
import com.smartphone.controller.*;

public class SmartPhoneView {
	public static void main(String [] arg) {
		
		Scanner input = new Scanner(System.in);
		
		SmartPhoneController smartphoneList = new SmartPhoneController();
		//smartphoneList.phoneDetails();
		smartphoneList.addPhone();
		smartphoneList.display();
	}
}
