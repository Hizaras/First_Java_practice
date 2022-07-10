import java.util.Scanner;

public class BodyMass{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();

		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();

		double weightKg = weight * 0.45359237;
		double heightM = height * 0.0254;

		Double bmi = weightKg / (heightM * heightM);
	
		System.out.printf("Your body mass index is %.4f", bmi);

	}
}
 