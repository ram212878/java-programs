/** Q.25 : Nilaa’s Catering provides meals for parties and special events. 
		Write a program that prompts the user for the number of guests attending an event
		and then computes the total price, which is $35 per person. 
		Display the number of guests, price per guest, and total price. 
		Also display a message that indicates true or false depending on whether the 
		job is classified as a large event—an event with 50 or more guests. 
		Save the file as NilaaEventPrice.java.
*@author Ram Babu Kumar Rai
*/

import java.util.Scanner;
public class NillaEventPrice{
	static final int RATE=35;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Number Of Guets Attending the Party:");
		int numOfGuests=sc.nextInt();
		int totalPrice=RATE*numOfGuests;
		System.out.println("Total Number Guets in Party= "+numOfGuests);
		System.out.println("Price per Guest= "+RATE);
		System.out.println("Total Price of the Party= "+totalPrice);
		System.out.println("Was the party Large?: "+isLarge(numOfGuests));

	}
	static Boolean isLarge(int n){
		if(n>=50)
			return true;
		else
			return false;
	}
}
