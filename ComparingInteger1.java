import java.util.Scanner;

public class ComparingInteger1 {

	public static void main(String[] arg){
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer 1: ");
		int num1 = input.nextInt();
		 
		System.out.print("Enter interger 2: ");
		int num2 = input.nextInt();

		if (num1 == num2) {
			System.out.printf("%d %d These numbers are equal", num1, num2);
		}
		
		if (num1 > num2) {
			System.out.printf("%d Is larger", num1);
		}
		
		if (num2 > num1) {
			System.out.printf("%d Is larger", num2);
		}
	}

}