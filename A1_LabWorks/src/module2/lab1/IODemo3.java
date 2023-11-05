package module2.lab1;

import java.io.File;

public class IODemo3 {
	public static void main(String[] args) {
		File file=new File("c:\\newtemp2");
		System.out.println(file.getName());
		System.out.println(file.exists());
		System.out.println(file.canWrite());
		System.out.println(file.getPath());
		System.out.println(file.isDirectory());
		System.out.println(file.renameTo(new File("c://newtemp1")));
	}

}
