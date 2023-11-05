package module2.week2;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;



public class NetworkProgramming {
	public static void main(String[] args) throws Exception{
		URL url=new URL("http://www.google.com/index.html");
		URLConnection urlcon=url.openConnection();
		BufferedReader br=new BufferedReader(new InputStreamReader(urlcon.getInputStream()));//decoriated pattern
		FileWriter out=new FileWriter("Google.html");
		int i=0;
		while((i=br.read())!=-1) {
			System.out.print((char)i);
			out.write(i);
		}
		out.close();
	}

}
