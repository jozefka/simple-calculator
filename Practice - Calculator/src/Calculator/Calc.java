package Calculator;

import java.util.Scanner;

public class Calc {
	private static Scanner inputA;
	private static Scanner inputB;
	private static Scanner inputOperation;

	public static void main(String[] args) {

		System.out.println("Enter the first number:");
		inputA = new Scanner(System.in);
		double a = inputA.nextDouble();
		System.out.println("Enter the second number:");
		inputB = new Scanner(System.in);
		double b = inputB.nextDouble();
		System.out.println("Enter the operation (+,-,/,*,%):");
		inputOperation = new Scanner(System.in);
		String operation = inputOperation.next();

		switch (operation) {
		case "+":
			System.out.println("The answer is: " + (a + b));
			break;
		case "-":
			System.out.println("The answer is: " + (a-b));
			break;
		case "*":
			System.out.println("The answer is: " + (a*b));
			break;
		case "/":
			System.out.println("The answer is: " + (a/b));
			break;
		case "%":
			System.out.println("The answer is: " + ((a/b)*100));
			break;
		}

	}

}
