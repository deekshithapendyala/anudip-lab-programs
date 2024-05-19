package sample;
import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double num1= scanner.nextDouble();
		System.out.print("Enter the second number: ");
		double num2= scanner.nextDouble();
		//addition
		double sum= num1+num2;
		System.out.println("Sum: "+ sum);
		//subtraction
		double difference=num1-num2;
		System.out.println("Difference: "+ difference);
		//Multiplication
		double product= num1*num2;
		System.out.println("Product: "+ product);
		//division
		if(num2 !=0) {
			double quotient=num1/num2;
			System.out.println("Quotient: "+ quotient);
		}
		else {
			System.out.println("Cannot divided by zero");
		}
		}
	}
