package sample;
import java.util.Scanner;


class HillStation {
	public void location() {
        System.out.println("Location not specified");
    }
	public void famousFor() {
        System.out.println("Famous for nothing in particular");
    }
}
class Manali extends HillStation {
	public void location() {
		System.out.println("Located in Himachal Pradesh, India");
    }
	public void famousFor() {
        System.out.println("Famous for its scenic beauty and adventure sports");
    }
	}
class Mussoorie extends HillStation {
	 public void location() {
	        System.out.println("Located in Uttarakhand, India");
	    }
	 public void famousFor() {
	        System.out.println("Famous for its pleasant weather and panoramic views");
	    }
	}
class Gulmarg extends HillStation {
	 public void location() {
	        System.out.println("Located in Jammu and Kashmir, India");
	    }
	 public void famousFor() {
	        System.out.println("Famous for its skiing and snowboarding facilities");
	    }
}


public class NorthTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the hill station (Manali/Mussoorie/Gulmarg):");
		String choice = scanner.nextLine().toLowerCase();
		HillStation hillStation;
		switch (choice) {
		case "manali":
			hillStation = new Manali();
			break;
		case "mussoorie":
			hillStation = new Mussoorie();
			break;
		case "gulmarg":
			hillStation = new Gulmarg();
			break;
		default:
			System.out.println("enter valid choice!");
			return;
		}

		hillStation.location();
		hillStation.famousFor();
		
		

	}

}
