import javax.swing.JOptionPane;
import java.util.Arrays;
public class ArrayParameterPassing {

	public static void main(String[] args) {
		int[] initialArray = {1, 2, 3};

		JOptionPane.showMessageDialog(null,
			"The initial array is: " + Arrays.toString(initialArray)
		);

		doubleArrayValues(initialArray);
		
		JOptionPane.showMessageDialog(null,
			"The initial array is: " + Arrays.toString(initialArray)
		);
	}
	
	private static void doubleArrayValues(int[] anArray) {
		for (int x = 0; x < anArray.length; x++) {
			anArray[x] *= 2;
		}	
	}

}

