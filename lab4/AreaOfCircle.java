package sample;
import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String userInput;
		{
			System.out.print("Enter 'YES' if you want the area of the circle: ");
			userInput=scanner.nextLine().trim().toUpperCase();
			
			if(userInput.equals("YES")) {
				System.out.print("Enter the radius of the circle: ");
				double radius = scanner.nextDouble();
				double area = Math.PI * Math.pow(radius,2);
				System.out.println("The area of the circle with radius " + radius + " is: " + area);
			}
		}

	}
}
