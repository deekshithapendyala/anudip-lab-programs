package sample;
import java.util.Scanner;

abstract class Shape {
	abstract double calculation();
	}
class Rectang extends Shape {
	double length;
	double width;
 
    Rectang(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double calculation() {
            return length * width;
          
        }
}
class Circle extends Shape {
	double radius;
    double area;
    Circle(double radius) {
        this.radius = radius;
    }
    double calculation() {
    	return Math.PI * radius * radius;
    }
}

public class DifferentShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.println("Select a shape to calculate area of (Rectangle/Circle):");
	        String choice = sc.nextLine().toLowerCase();
	        switch (choice) {
	        case "rectangle":
                System.out.println("Enter length:");
                double length = sc.nextDouble();
                System.out.println("Enter width:");
                double width = sc.nextDouble();
                Rectang a= new Rectang(length, width);
                System.out.println("Area of Rectangle: " +a.calculation());
                break;
            case "circle":
                System.out.println("Enter radius:");
                double radius = sc.nextDouble();
                Circle b = new Circle(radius);
                System.out.println("Area of Circle: " +b.calculation());
                break;
            default:
                System.out.println("Enter valid choice!");
                break;
	        
	        }

	}

}
