package sample;
import java.util.*;
public class Months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number");
		int userInput=scanner.nextInt();
		if ((userInput > 0) && (userInput < 13))
        {
           System.out.println("selected number is "+userInput);
        }
        else
        {
            System.out.println("number not in range select anumber between 1 and 12");
            userInput = scanner.nextInt();
        }
       
      String monthName;
       switch (userInput) {
           case 1:
               monthName = "January";
               break;
           case 2:
               monthName = "February";
               break;
           case 3:
               monthName = "March";
               break;
           case 4:
               monthName = "April";
               break;
           case 5:
               monthName = "May";
               break;
           case 6:
               monthName = "June";
               break;
           case 7:
               monthName = "July";
               break;
           case 8:
               monthName = "August";
               break;
           case 9:
               monthName = "September";
               break;
           case 10:
               monthName = "October";
               break;
           case 11:
               monthName = "November";
               break;
           case 12:
               monthName = "December";
               break;
           default:
               monthName = "Invalid month"; // This should never happen
               break;
           }
           
           System.out.println("Corresponding month name: " + monthName);
       
       scanner.close();
	}

}
