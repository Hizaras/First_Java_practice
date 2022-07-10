import java.util.Scanner;

public class Acceleration {

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter intial velocity: ");
		double v1 = input.nextDouble();

		System.out.print("Enter final velocity: ");
		double v2 = input.nextDouble();
		
		System.out.print("Enter time in seconds: ");
		double t = input.nextDouble();
		
		double averageAcceleration = (v2 - v1)	/ t;
		System.out.printf("Average acceleration is %.3f", averageAcceleration);	
	
	}

}

 