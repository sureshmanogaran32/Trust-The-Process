package com.powerstart;

public class String3_CountString {
	public static void main(String[] args) {
		//Count String
		String input = "sureshpriya";
		int countInput = 0;
		for(int i=0; i<=input.length()-1; i++) {
			countInput++;
		}
		System.out.println("Input String :"+countInput);
		
		String input1 = "  suresh priya ";
		// String trim = input1.trim(); // We can use trim to remove before and after space
		System.out.println("Input String with space : "+input1.length());
		int countInput1 = 0;
		for(int i=0; i<=input1.length()-1; i++) {
			if(input1.charAt(i) != ' ')
			countInput1++;
		}
		System.out.println(countInput1);
	}

}
