/** Q.13 Write a Java program to perform the Bitwise operation(AND, OR and XOR) of the given two integers
*@author Ram Babu Kumar Rai 
*/
import java.util.*;
public class PerformBitwiseOperation{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=1,n1=0,n2=0;
		while(n==1){
		System.out.println("1.Perfom AND operation\n2.Perform OR operation\n3.Perform XOR operation\n4.Exit\n");
		System.out.println("Enter your Choice:");
		int ch=sc.nextInt();
		if(ch<4){
		System.out.println("Enter two Integers:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		}
		switch(ch){
			case 1:System.out.printf("result of %d & %d in decimal = %d\n",n1,n2,n1&n2);n=0;
				System.out.println("Result of"+n1+" & "+n2+" in binary = "+Integer.toString((n1&n2),2));break;
			case 2:System.out.printf("result of %d | %d in decimal=%d\n",n1,n2,n1|n2);n=0;
					System.out.println("Result of"+n1+" | "+n2+" in binary = "+Integer.toString((n1|n2),2));break;
			case 3:System.out.printf("result of %d ^ %d in decimal=%d\n",n1,n2,n1^n2);n=0; 
					System.out.println("Result of"+n1+" ^ "+n2+" in binary = "+Integer.toString((n1^n2),2));break;
			case 4:System.out.println("Exit...");n=0;break;
			default:System.out.println("\nPlease Enter the correct Choice");
					System.out.println("Press 1 try again else 4 to exit");
					n=sc.nextInt();
					break;
				}
		}
	}
}
