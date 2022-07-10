public class CalculationTest {

	public static void main(String [] args) {
	
	Calculation cal = new Calculation();
        int addResult = cal.addNumber(3, 7);
 	int subResult = cal.substractNumber(6, 4);
	int divResult =cal.divideNumber(7, 5);
	int mulResult = cal.multiplyNumber(8, 6);

	System.out.println(addResult);
	System.out.println(subResult);
	System.out.println(divResult);
	System.out.println(mulResult);

	}

}