//application that asks the user to enter two integers

import java.util.Scanner;

	
public class Arithmetic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("enter first integer: ");
		int num1 = input.nextInt();

	
		System.out.print("enter second integer: ");
		int num2 = input.nextInt();

		
		int squareNum1 = num1 * num1;
		int squareNum2 = num2 * num2;

		
		int sumSquare = squareNum1 + squareNum2;
		int difSquare = squareNum1 - squareNum2;


		System.out.printf("square of number1 is %d%nSquare of num 2 is %d %nSum of Square is %d%nDifference of Square is %d%n", squareNum1,squareNum2,sumSquare,difSquare);

		
		 
}

}