package sample;
import java.util.Scanner;
class Geometry {
	
	 public static double  areaofRectangle(double length,double width) {
		return length*width;
		
	}
	 public static double areaofCircle(double radius) {
		 return Math.PI*radius*radius;
	 }
	 public static double areaofBox(double length,double breath,double height) {
		 return length*height*breath;
	 }
public static class Areacalcu {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int choice;

        do {
            System.out.println("Geometry Calculator\n");
            System.out.println("1. Calculate area of a rectangle");
            System.out.println("2. Calculate area of a circle");
            System.out.println("3. Calculate volume of a box");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice (1-4): ");
            choice = scanner.nextInt();
            switch (choice) {
            case 1:
                System.out.print("Enter length of rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of rectangle: ");
                double width = scanner.nextDouble();
                System.out.println("Area of rectangle: " + Geometry.areaofRectangle(length, width));
                break;
            case 2:
                System.out.print("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of circle: " + Geometry.areaofCircle(radius));
                break;
            case 3:
                System.out.print("Enter length of box: ");
                double boxLength = scanner.nextDouble();
                System.out.print("Enter width of box: ");
                double boxWidth = scanner.nextDouble();
                System.out.print("Enter height of box: ");
                double boxHeight = scanner.nextDouble();
                System.out.println("Volume of box: " + Geometry.areaofBox(boxLength, boxWidth, boxHeight));
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }
    } while (choice != 4);

	


	}

}
}
