package module2.week1;

import java.io.FileReader;
import java.io.FileWriter;


public class CopyCommandRevision {
	public static void main(String[] args) {
		try(
				FileReader in=new FileReader("temp.txt");
				FileWriter out=new FileWriter("copytemp.txt")){
			int i=0;
			char b[]=new char[6];
			while((i=in.read(b))!=-1) {
				System.out.println("No of characters read... "+i);
				String s= new String(b,0,i);
				System.out.println(s);
				out.write(b,0,i);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
