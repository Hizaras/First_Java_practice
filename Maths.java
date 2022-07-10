//application to calculate numbers

import java.util.Scanner;

public class Maths {
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);

		System.out.print("enter first number: ");
		int number1 = input.nextInt();
		
		System.out.print("entersecond number: ");
		int number2 = input.nextInt();

		int sum = number1 + number2;

		System.out.printf("sum is %d%n", sum);
	}
}