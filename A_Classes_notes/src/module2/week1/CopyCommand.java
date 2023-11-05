package module2.week1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyCommand {
	public static void main(String[] args) {
		
		
		try(
				FileInputStream fis=new FileInputStream("temp.txt");
				FileOutputStream fos=new FileOutputStream("copytemp.txt",true)
			){
			int i=0;
			
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
				fos.write(i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
