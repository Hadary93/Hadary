import java.util.Scanner;

public class DigitsCounter{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter an integer value");
		long value = scan.nextLong(); // i have used long identifier to increase the range of input numbers
		System.out.println("You entered: " + value);
		int count=0; //set a variable "count" to be incremented by 1 each itteration of while loop.

		while(value>0)						//as long as value is greater than 0
		{ value/=10; 	++count;}		/* divide it by 10 to reduce number by tenth, and the remainder will be neglected
														  as "value" is identified as integer.*/
 	System.out.println("number of digits " + count); // print the result after all itterations.
		 }
}
