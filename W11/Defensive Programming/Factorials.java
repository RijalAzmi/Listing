package W11;

import java.util.Scanner;

public class Factorials {
	public static void main(String[] args) {
		String keepGoing = "y";
		Scanner scan = new Scanner(System.in);
		
		while (keepGoing.equals("y") || keepGoing.equals("Y")){
			System.out.print("Enter an integer: ");
			int val = scan.nextInt();
			try{
				System.out.println("Factorial(" + val + ") = "+ MathUtils.factorial(val));
			} 
			catch (IllegalArgumentException ie){
				 System.out.println(ie.getMessage());
			}
			System.out.print("Another factorial? (y/n) ");
			keepGoing = scan.next();
		}
	}
}
