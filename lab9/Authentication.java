package sample;

class UserManager {
	public static void details(String username,String password) {
		System.out.println(username+" login success");
	}
	public   static void details(String email, long phoneno) {
		System.out.println(email+"  YOUR  login successful using EmailId.");
	}
	public static void  details(long phoneno,int pin) {
		System.out.println(phoneno+" YOUR login successful using phoneNo.  ");
	}
	public   static void details(String email, int pin) {
		System.out.println(email+"  YOUR  login successful using EmailId.");
	}
	public   static void details(long phoneno,String password) {
		System.out.println(phoneno+"  YOUR  login successful using PhoneNo.");
	}
	
}


public class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserManager u =  new UserManager();
		u.details("7756578838d",24676787);
		u.details("deekshu11020.com",9866710852l);
		u.details("deejshyt pendyal","*********");
		u.details("stuthi@gmail.com", 2399);
		u.details(763747446, "^^^^^^^^^^^^");


	}

}
