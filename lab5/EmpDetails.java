package sample;

public class EmpDetails {
	private int empId;
	private String empName;
	private static String companyName;
	public static void setCompanyName(String name) {
		companyName=name;
		
	}
	public EmpDetails(int empId, String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	public static void displayCompanyName() {
		System.out.println("The company name : "+ companyName);
	}
	public void displayDetails() {
		System.out.println("Employee ID: "+ empId);
		System.out.println("Employee Name: "+ empName);
		displayCompanyName();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDetails.setCompanyName("learnx corporation");
		EmpDetails emp1=new EmpDetails(606,"dee");
		EmpDetails emp2=new EmpDetails(609,"stuthi");
		emp1.displayDetails();
		emp2.displayDetails();
		
		

	}

}
