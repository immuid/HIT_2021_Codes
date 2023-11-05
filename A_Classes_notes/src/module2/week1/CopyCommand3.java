package module2.week1;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyCommand3 {
	public static void main(String[] args)  {
		
		try(
				FileReader reader=new FileReader("temp.txt");
				FileWriter write=new FileWriter("copytemp2.txt");
				){
			int i=0;
			char charbag[]=new char[6];
			while((i=reader.read(charbag))!=-1) {
				System.out.println("Loop load..");
				System.out.println(new String(charbag));
				write.write(charbag);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
