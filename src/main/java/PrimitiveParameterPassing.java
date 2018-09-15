import javax.swing.JOptionPane;
public class PrimitiveParameterPassing {

	public static void main(String[] args) {
		int initialNumber = 3;

		JOptionPane.showMessageDialog(null,
			"The initial number is: " + initialNumber
		);

		int doubledNumber = doubleNumber(initialNumber);
		
		JOptionPane.showMessageDialog(null,
			"The initial number is: " + initialNumber +
			"\nThe doubled number is: " + doubledNumber 
		);
	}

	private static int doubleNumber(int aNumber) {
		return aNumber * 2;
	}

}

