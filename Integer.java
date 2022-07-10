//Answer to Q. 2.16

import java.util.Scanner;
public class Integer{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int number = input.nextInt();

		int numberSquare = number * number;
		
		if(number > 100){
		System.out.println("Number is greater than 100");
		}
		
		if(number < 100){
		System.out.println("Number is less than 100");
		}
		
		if(number == 100){
		System.out.println("Number is equalto 100");
		}
		
		if(numberSquare > 100){
		System.out.println("Number Square is greater than 100");
		}
		
		if(numberSquare < 100){
		System.out.println("Number Square is less than 100");
		}

		if(numberSquare == 100){
		System.out.println("Number square is equal to 100");
		}
	}

}