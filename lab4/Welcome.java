package sample;
import java.util.Scanner;
public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name=scanner.nextLine();
		System.out.println("We welcome you, "+ name + "!");
	}

}
