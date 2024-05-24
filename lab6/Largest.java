package sample;
import java.util.*;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        
        System.out.println("The largest number is: " + largest);
        scanner.close();

	}

}
