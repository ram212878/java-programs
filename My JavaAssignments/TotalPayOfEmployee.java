/**Q.21 Write a program that reads in the hourly wage of an employee. 
	Then ask how many hours the employee worked in the past week. 
	Be sure to accept fractional hours. Compute the pay. 
	Any overtime work (over 40 hours per week) is paid at 150 percent of the regular wage. 
	Solve this problem by implementing a class Paycheck.

*@author Ram Babu Kumar Rai
*/

import java.util.Scanner;
class PayCheck{
	float pay(float hours,float wage){
		if(hours>40)
			return (((hours-40)*1.50f*wage)+(40*wage));
		else
			return(wage*hours);
	}
}

public class TotalPayOfEmployee{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Wage per hour:");
		float wage=sc.nextFloat();
		System.out.println("Enter number of Hours worked in Last Week:");
		float hours=sc.nextFloat();
		PayCheck obj=new PayCheck();
		System.out.printf("Your Total Pay becomes:Rs.%.2f",obj.pay(hours,wage));
	}
}