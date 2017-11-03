package array_fun;

import javax.swing.JOptionPane;

public class ArrayFun {

	public void showInstructions() {
		
		String[] msgArray = { 
				"Essential rules for arrays", 
				"1. Arrays have a FIXED length!! At the time they are created.",
				"2. Two ways to set array size:",
				"-- one way is to set size when constructed",
				"-- other way is to set size from initial data \\",
				"Dynamic - when program is running:",
				"But OF COURSE you can change values!",
				"Can NOT NO WAY NO HOW change the SIZE of the array!"
				};
		JOptionPane.showMessageDialog(null,  msgArray);
	}
	public void intArrayExample() {
		
		int[] intTest = new int[10];
		intTest[0] = 10;
		intTest[1] = 11;
		intTest[2] = 12;
		intTest[3] = 13;
		intTest[4] = 14;
		intTest[5] = 15;
		intTest[6] = 16;
		intTest[7] = 17;
		intTest[8] = 18;
		intTest[9] = 19;
		int[] intTwoTest = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Strarting test of intTest[]\n");
		for (int i = 0; i < intTest.length; i++) {
			System.out.println("intTest[" + i + "] " + intTest[i]);
		}
	
	}

}
