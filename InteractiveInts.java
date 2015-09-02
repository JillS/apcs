import java.util.Scanner;

public class InteractiveInts 
{
	
	public static void main(String[] args) {
		
		Scanner keybd = new Scanner(System.in);
		
		System.out.println("Welcome to the Product Maker");
		
		System.out.print("Enter 1st integer:  ");
		int firstInt = new Integer(keybd.nextLine());
		
		System.out.print("Enter 2nd integer:  ");
		int secondInt = new Integer(keybd.nextLine());

		int product = firstInt * secondInt;
			
		System.out.println("Product of " + firstInt + " and " + secondInt + " is " + product ); 
	}
}
