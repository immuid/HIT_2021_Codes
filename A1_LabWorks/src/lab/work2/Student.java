package lab.work2;

public class Student {
	String name,city;
	int age;
	static int m;
void printData() {
	System.out.println("Student name =" +name);
	System.out.println("Student city ="  +city);
	System.out.println("Student age = " +age);
}
}
class Stest{
public static void main(String[] args) {
	Student s1=new Student();
	Student s2=new Student();
	
	s1.name="raja";
	s1.city="mumbai";
	s1.age=20;
	s2.name="nikith";
	s2.city="delhi";
	s2.age=22;
	s2.printData();
	
	s1.printData();
	s1.m=10;
	s2.m=12;
	Student.m=27;
	System.out.println("s1.m = "+s1.m);
	System.out.println("s2.m = "+s2.m);
	System.out.println("Student.m = "+ Student.m);
	
	
}
}
