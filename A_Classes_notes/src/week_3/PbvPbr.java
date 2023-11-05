package week_3;

public class PbvPbr {
	public static void main(String[] args) {
		Ladu laddu=new Ladu();
		laddu.setSize(10);
		System.out.println(" Initial size of the laddu is...:"+laddu.getSize());
		
		PBV pbv=new PBV();
		pbv.modifySizeOfLaddu(laddu.size);
		System.out.println(" Size of laddu after pbv...:"+laddu.getSize());
		
		PBR pbr=new PBR();
		pbr.modifySizeOfLaddu(laddu);
		System.out.println(" Size of laddu after pbr...:"+laddu.getSize());

		
		
	}
	
}
class PBV{
	public void modifySizeOfLaddu(int size) {
		size=size-5;
	}
	
}
class PBR{
	public void modifySizeOfLaddu(Ladu laddu) {
		laddu.setSize(5);
		
	}
	
}
class Ladu{
	int size;
	public void setSize(int size) {
		this.size=size;
	}
	public int getSize() {
		return this.size;
	}
}








//	public static void main(String[] args) {
//		Ladu laddu =new Ladu();
//		laddu.setSize(10);
//		System.out.println("Initial size of laddu is :"+laddu.getSize());
//		
//		PBV pbv=new PBV(); 
//		pbv.modifySizeOfLaddu(laddu.size); 
//		System.out.println("size of laddu after pbv ...:"+laddu.getSize());
//		
//		PBR pbr=new PBR();
//		pbr.modifySizeOfLaddu(laddu);
//		System.out.println(" size of laddu after pvr ...:"+laddu.getSize());
//	}
//
//}
//class PBV{
//	public void modifySizeOfLaddu(int size) {
//		size=size-5;
//	}
//}
//class PBR{
//	public void modifySizeOfLaddu(Ladu laddu) {
//		laddu.setSize(5);
//	}
//}
//class Ladu{
//	int size;
//	public void setSize(int size) {
//		this.size=size;		
//	}
//	public int getSize() {
//		return this.size;
//	}
//}