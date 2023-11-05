package exceptionhandlings_;
/*
 * Throwable is a parent class of Exception.
 * we can use Throwable or Exception.
 */

public class ExceptionDemo5 {
	public static void main(String[] args){
		System.out.println("Before Exception...");
		Exam exam=new Exam();
		try {
		exam.writeExam("cjnsjnc");
		}catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After Exeption...");
	}

}
class Exam{
	public void writeExam(String hallticket)throws Throwable {
		if(hallticket==null) {
		throw new Exception();
		}
		else if(!hallticket.equalsIgnoreCase("examticket")) {
			throw new HallticketException("Invalid exam hallticket .....");	
		}
	}
}
class HallticketException extends Throwable{
	String msg;
	public HallticketException(String msg) {
		this.msg=msg;
		}
	@Override
		public String toString() {
			return "Exception is "+this.msg;
		}
	
}
