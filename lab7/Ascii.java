package sample;
import java.util.Scanner;
public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		char ch;
		System.out.println("Enter a character: ");
		ch=scanner.next().charAt(0);
		int s=ch;
		System.out.println("Ascii value of "+ch+" is:" +s);
		
		
		

	}

}
