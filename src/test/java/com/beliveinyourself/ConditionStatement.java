package com.beliveinyourself;

public class ConditionStatement {


	public static void main(String[] args) {
	// Check If-else
		int age = 25;
		if(age>=18) {
			System.out.println("Eligible for Voting");
		} else {
			System.out.println("NOT Eligible for Voting");
		}
	//Check If-else If-else or If else-if
		int mark =89;
		if(mark>=90)
		{
			System.out.println("GRADE A");
		} else if(mark>=70)
		{
			System.out.println("GRADE B");
		} else
		{
			System.out.println("GRADE E");
		}
		
		// Check Nested If
		int voterAge = 25;
		boolean voterID = true;
		if(voterAge >=18) {
			if(voterID == true) {
				System.out.println("Eligible to Vote");
			} else {
				System.out.println("Not Eligible to Vote");
			}
			
		}
	}

}
