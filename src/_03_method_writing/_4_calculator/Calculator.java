package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		int operation = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);

		// 3) Call the correct method depending on what option the user chooses
		if(operation==0){
			divide(num1, num2);
		}else if(operation==1){
			multiply(num1, num2);
		}else if(operation==2){
			subtract(num1, num2);
		}else{
			add(num1, num2);
		}
		
		// 4) Call the result() method and put the answer in a pop-up
	}
	
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	static void add(int num1, int num2){
		JOptionPane.showMessageDialog(null, num1+num2); 
	}

	// 4. Create similar methods for subtraction, multiplication and division.
	static void subtract(int num1, int num2){
		JOptionPane.showMessageDialog(null, num1-num2); 
	}
	static void multiply(int num1, int num2){
		JOptionPane.showMessageDialog(null, num1*num2); 
	}
	static void divide(int num1, int num2){
		JOptionPane.showMessageDialog(null, num1/num2); 
	}
	 
	
	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;

	
}
