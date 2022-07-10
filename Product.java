import java.util.Scanner;

public class Product{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Type first integer");
	int num1 = input.nextInt();

	System.out.print("Type second integer");
	int num2 = input.nextInt();

	int division = num1 * num2;

	System.out.printf("Product is %d%n ", division);

	

	}

}