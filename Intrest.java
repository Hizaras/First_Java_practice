import java.util.Scanner;

public class Intrest {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter balance:" );
	double balance = input.nextDouble();
	
	System.out.print("Enter annual Intrest Rate: ");
	double annualIntrestRate = input.nextDouble();
	
	double intrest = balance * (annualIntrestRate / 1200);

	System.out.printf("The intrest is %.5f", intrest);

	} 


}