package module2.lab1;

import java.io.FileReader;
import java.io.FileWriter;

public class FileIODemo2 {
	public static void main(String[] args) {
		try(
				FileReader fr=new FileReader("temp.txt");
				FileWriter fw=new FileWriter("copy1.txt")
				){
			
			int i=0;
			char c[]=new char[7];
			while((i=fr.read(c))!=-1) {
				System.out.println("Loop Load...");
				System.out.println("No of file read... "+i);
				String s=new String(c,0,i);
				System.out.println(s);
				fw.write(c,0,i);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
