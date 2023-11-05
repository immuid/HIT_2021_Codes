package module2.week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
ServerSocket ss;Socket s;
BufferedReader in,clientIn;PrintWriter out;
public Server() {
	try {
		ss=new ServerSocket(1025);//upto port number 1024 the port are occupide by the system...
		System.out.println("Server Is Ready To Accept Connections....");
		while(true) {
			
			s=ss.accept();
			
			in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please Enter a Message To Client : ");
			String msg=in.readLine();
			out=new PrintWriter(s.getOutputStream(),true);
			out.println(msg);
			clientIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String msgFromClient=clientIn.readLine();
			System.out.println("From Client...: "+msgFromClient);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
	new Server();
}
}
