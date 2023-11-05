package week_4;

public class InterfaceDemo {
	public static void main(String[] args) {
		 AlopathyMedicalCollege stanley=new AlopathyMedicalCollege();
		 Doctor doctor=(Doctor)stanley;//By casting you will get user levle rights and previlages
		 doctor.doCure();
		Nurse nurse=(Nurse)stanley;
		nurse.doNursing();
		
		HomeopathyMedicalCollege homeoDoctor=new HomeopathyMedicalCollege();
		 Doctor doctor2=(Doctor)homeoDoctor;
		 doctor2.doCure();
		 Nurse nurse2=(Nurse)homeoDoctor;//I will get an Exception at this line ...
		 nurse.doNursing();
	}

}
 interface Doctor{
	 //there is no compulsion to have a method...
	 //intefaces with no methods are called marker interfaces
	 //you can have one or more methods
	 //interface with only one method is called fuctional interface
	 public void doCure();
	 //interface with more than one metho is a normal interface
	 //what is special about fucntional interfaces ?
	 //Fucntional interfaces alone 	can use - Method Expressions and Lambdas.
	 //where as marker interfaces and normal interfaces (interface with more than one method)
	 //can not use Method Expressions and Lambdas - introduced in JDK8.
	 //interface can also have fields Declared...
	final static int i=10;//Even if you dont give it is still final and static//it should be declared with the value else it throws error(Ex: int i;)it throws error.
	 //Fields are by default static and final .Which means they are constants.
	 //interfaces can also have methods with Business Logic from jdk 9.
	 default public void met() {
		 System.out.println("met called...");
	 }
	 //Default Method can be accessed only within the interfaces
	 //They are equivalent to Template method of Abstract classes	 
 }
 //Interface can extend another interface
 interface Surgeon extends Doctor{
	 
 }
 interface Nurse{
	 public void doNursing();
 }
 //Implementation class of interface...
 class AlopathyMedicalCollege implements Doctor,Nurse{

	@Override
	public void doCure() {
		System.out.println("do cure method called...as per Alopathy....");		
	}

	@Override
	public void doNursing() {
		// TODO Auto-generated method stub
		
	}	 
 }
 
 class HomeopathyMedicalCollege implements Doctor{
	 @Override
	public void doCure() {
		System.out.println("do cure method called... as per homeopathy.... ");		
	}
 }