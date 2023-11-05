package exceptionhandlings_;

import java.io.FileInputStream;

public class ExceptionDemo4 {
	public static void main(String[] args){
		System.out.println("Before Exception...");
		try {
			FileInputStream fs=new FileInputStream("aaa.txt");
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("After Exeption...");
	}

}
