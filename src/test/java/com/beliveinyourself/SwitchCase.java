package com.beliveinyourself;

public class SwitchCase {
	public static void main(String[] args) {
		// checking one single variable against multiple fixed constant values
		int day = 2;
		
		switch (day) {
		case 1 :
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;

		default:
			System.out.println("In Valid Input");
			break;
		}
		
	}
}
