import java.util.Scanner;

public class Mathematics{
	
	public static void main(String[] args){

		Scanner collectInput = new Scanner(System.in);
	
		System.out.print("Enter integer 1: ");
		int num1 = collectInput.nextInt();
	
		System.out.print("Enter integer 2: ");
		int num2 = collectInput.nextInt();

		int sum = num1 + num2;
		System.out.printf("the sum is %n%d%n", sum);
	
		int sub = num1 - num2;
		System.out.printf("the diff is %n%d%n", sub);

		int mult = num1 * num2;
		System.out.printf("the product is %n%d%n", mult);

		int div = num1 / num2;
		System.out.printf("the difference is %n%d%n", div);

	}
}
