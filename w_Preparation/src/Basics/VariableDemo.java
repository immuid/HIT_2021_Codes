package Basics;

public class VariableDemo {
	public static void main(String[] args) {
		TrainingRoom gandhi=new TrainingRoom();
		TrainingRoom nehru=new TrainingRoom();
		gandhi.teach();gandhi.teach();gandhi.teach();
		nehru.teach();nehru.teach();
	}

}
class TrainingRoom{
	public TrainingRoom() {
		System.out.println("TrainingRoom object created ");
	}
	Projector pro=new Projector();//Instance variable
	static Toilet toilet=new Toilet();//Class Variable
	void teach() {
		Student stu=new Student();//Local Variable
	}
}
class Projector{
	public Projector() {
		System.out.println("projector object created");
	}
}
class Student{
	public Student() {
	 System.out.println("Student object created");	
	}
}
class Toilet{
	public Toilet() {
		System.out.println("toilet object created");
	}
}