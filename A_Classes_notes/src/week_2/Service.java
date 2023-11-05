package week_2;

public class Service {
	void help(Police p) {
		System.out.println(" The caller is a police ");
	}
	void help(AccidentVictim av) {
		System.out.println(" The caller is a Accident Victim ");
	}
	void help(Helper H) {
		System.out.println(" The caller is a Helper ");
		
	}
	public static void main(String[] args) {
		Service s108= new Service();
		Police durai = new Police();
		AccidentVictim driver =new AccidentVictim();
		Helper nss = new Helper();
		
		s108.help(driver);
		s108.help(durai);
		s108.help(nss);
	}
	
	
	
}
	class Police{
//		public Police() {
//			
//		}
	}
	class AccidentVictim{
//		public AccidentVictim() {
//			
//		}
	}
	class Helper{
//		public Helper() {
//			
//		}
	}























//	void help(Police p) {
//		System.out.println(" The caller is a police man.... let us connect to the ControlRoom");
//	}
//	void help(AccidentVictim v) {
//		System.out.println(" The caller is a AccidentVictim.... let us connect to the doctor");
//	}
//	void help(Helper p) {
//		System.out.println(" The caller is a Helper ... let us help him ");
//	}
//	public static void main(String[] args) {
//		
//		Service help108=new Service();
//		Police vijay=new Police();
//		AccidentVictim Boy=new AccidentVictim();
//		Helper nss=new Helper();
//		help108.help(vijay);
//		help108.help(nss);
//		help108.help(Boy);
//	}
//			
//}
//
//class Police{
//
//}
//class AccidentVictim{
//	
//}
//class Helper{
//	
//}