package module2.lab1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIODemo {
	public static void main(String[] args) {
		try(
				FileInputStream fis=new FileInputStream("temp.txt");
				FileOutputStream fos=new FileOutputStream("copy.txt",true)
				){
			System.out.println(fis.available());
		
			byte b[]=new byte[fis.available()];
			int i=0;
			while((i=fis.read(b))!=-1) {
				System.out.println("Loop..Loading..");
				System.out.println("No of charecters read..."+i);
				String s=new String(b,0,i);
				System.out.println(s);
				fos.write(b,0,i);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	

}
}
