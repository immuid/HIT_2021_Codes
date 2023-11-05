package module2.week1;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyCommand2 {
	public static void main(String[] args) {
		
		try(
				FileReader fr=new FileReader("temp.txt");
				FileWriter fw=new FileWriter("copytemp1.txt");
				){
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
				fw.write(i);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
