package sample;

interface Person{
	void speak();
}
class Student implements Person {
    public void speak() {
        System.out.println("I am a student studing in 9th class.");
    }
}
class Teacher implements Person {
    public void speak() {
        System.out.println("she will teach physics.");
    }
}
public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student student = new Student();
	        Teacher teacher = new Teacher();
	        student.speak();
	        teacher.speak();

	}

}
