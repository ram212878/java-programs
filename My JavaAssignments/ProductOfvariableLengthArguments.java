/** Q.21 : Write an application that calculates the product of a series of integers
			that are passed to method product using a variable-length argument list. 
			Test your method with several calls, each with a different number of arguments.
*@author Ram Babu Kumar Rai
*/
import 	java.util.Scanner;
public	class ProductOfvariableLengthArguments{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the series to get Their product");
			String str=sc.nextLine();
			String[] s=str.split("\\s+");
			int len=s.length;
			int[] intArray=new int[len];
			for(int i=0;i<len;i++){
					intArray[i]=Integer.parseInt(s[i]);
		}
			long answer=product(intArray);
			System.out.println("The product of the given series is= "+answer);

	}
	static long product(int... values){
		long result=1;
		for(int i:values)
			result*=i;
		return result;
	}
}