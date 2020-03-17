import java.util.Scanner;

public class BasicStructures{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter two integer values");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("For a you entered: " + a);
		System.out.println("For b you entered: " + b);

		int sum= a + b; // summition of entered variables
		int c = 10; // comparing value
		if(sum>c){
			System.out.println("a+b is greater than "+ c );}
		else if (sum<c)	{
				System.out.println("a+b is less than "+ c );
		}
		else {System.out.println("a+b is equals to " + c );
		}

		scan.close();
	}

}
