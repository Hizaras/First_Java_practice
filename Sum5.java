import java.util.Scanner;

public class Sum5{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
			System.out.print("Enter integer 1: ");
			int num1 = input.nextInt();
		
			System.out.print("Enter integer 2: ");
			int num2 = input.nextInt();

			int sum = num1 + num2;

			System.out.printf("Sum is %d%n", sum);
			

	}

}