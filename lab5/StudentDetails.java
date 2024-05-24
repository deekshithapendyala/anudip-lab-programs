package sample;
import java.io.Serializable;
class Student implements Serializable {
	private String studentname;
	private int rollno;
	private boolean active;
	public char[] getActive;
	
	
	Student() {
	}
	public String getStudentname() {
		return studentname;
		
	}
	public void setStudentname(String studentname) {
		this.studentname=studentname;
		
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno=rollno;
		
		
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
	}
	}
class StudentDetails{
	public static void main(String args[]) {
		Student stud= new Student();
		stud.setStudentname("Harsha");
		System.out.println(stud.getStudentname());
		stud.setRollno(42);
		System.out.println(stud.getRollno());
		stud.setActive(false);
		System.out.println(stud.isActive());
	}
	
}