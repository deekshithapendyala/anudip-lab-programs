package sample;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		 double num1, num2, result;
	        char operator;
	        System.out.print("Enter first number: ");
	
			num1 = scanner.nextDouble();
	        System.out.print("Enter an operator (+, -, *, /): ");
	        operator = scanner.next().charAt(0);
	        System.out.print("Enter second number: ");
	        num2 = scanner.nextDouble();
	        if (operator == '+') {
	            result = num1 + num2;
	        } else if (operator == '-') {
	            result = num1 - num2;
	        } else if (operator == '*') {
	            result = num1 * num2;
	        } else if (operator == '/') {
	            if (num2 != 0) {
	                result = num1 / num2;
	            } else {
	                System.out.println("Error: Division by zero is not allowed.");
	                return;
	            }
	        } else {
	            System.out.println("Error: Invalid operator.");
	            return;
	        }

	        System.out.println("Result: " + result);
	    }
	}
	        
		