package algorithms;

import javax.swing.JOptionPane;

public class Prime {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("Give me a number, I will see if it is prime.");
		boolean b = prime(number);
		if (b==true) {
			System.out.println("It's PRIME!");
		}else {
			System.out.println("it's not prime");
		}
	}
	static boolean prime(String number) {
		int number2 = Integer.parseInt(number);
		for (int i=2; i<number2;i++) {
			if (number2%i==0) {
				return false;
			}
		}
		return true;	
}}

