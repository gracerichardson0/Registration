import javax.swing.JOptionPane;
import java.util.Arrays;
public class ReturnArrayExample {

	public static void main(String[] args) {
		int[] initialArray = {1, 2, 3};
		int[] doubledArray;

		JOptionPane.showMessageDialog(null,
			"The initial array is: " + Arrays.toString(initialArray)
		);

		doubledArray = doubleArrayValues(initialArray);
		
		JOptionPane.showMessageDialog(null,
			"The initial array is: " + Arrays.toString(initialArray) +
			"\nThe doubled array is: " + Arrays.toString(doubledArray)
		);
	}
	
	private static int[] doubleArrayValues(int[] anArray) {
		int[] newArray = new int[anArray.length];
		
		for (int x = 0; x < anArray.length; x++) {
			newArray[x] = anArray[x] * 2;
		}
		
		return newArray;	
	}


}

