package module2.lab1;

import java.io.File;

public class IODemo4 {
	public static void main(String[] args) {
		File file=new File("newtemp");
		if(file.isDirectory()) {
			String s[]=file.list();
			for(String filename:s ) {
				System.out.println(filename);
		}
		}
	}

}
