package module2_demo_practice;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public Server() {
		ServerSocket ss; Socket s;
		try {
		
			while(true) {
			ss=new ServerSocket(2000);
			System.out.println("Server Ready To Accept Connections....");
			s=ss.accept();
			System.out.println(s);
			}
		
		}catch (Exception e) {
		e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Server();

	}
}
