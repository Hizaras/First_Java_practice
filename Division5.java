import java.util.Scanner;

public class Division5{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Type first number: ");
	int num1 = input.nextInt();

	System.out.print("Type second number: ");
	int num2 = input.nextInt();

	int quotient = num1 / num2;

	System.out.printf("Quotient is %d%n: ", quotient);

	}

}
 