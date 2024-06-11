package sample;

class Person{
	 String name;
	 int age;
	
	 void speak(){
		 System.out.println("hello my name is " +name+ " and i am " +age+ "years old");
	 }
}
class Stoodents extends Person {
	 
	String grade;

	  public void study() {
	    System.out.println("I've completed my grade " + grade + ".");
	  }
	}
public class PersonDeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stoodents stud = new Stoodents();
		 stud.age=23;
		 stud.grade="MCA";
		 stud.name="Dee";
		 stud.speak();
		 stud.study();
	}

}

