package module2.week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	Socket clientSock;
	BufferedReader serverIn,in;
	PrintWriter out;
	public Client() {
		try {
			while(true) {
				
			clientSock=new Socket("localhost",1025);
			
			serverIn= new BufferedReader(new InputStreamReader(clientSock.getInputStream()));
			String msgFromServer=serverIn.readLine();
			System.out.println("From Server... : "+msgFromServer);
			
			in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please Enter a Message to server..: ");
			String msgToServer=in.readLine();
			
			out=new PrintWriter(clientSock.getOutputStream(),true);
			out.println(msgToServer);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Client();
	}

}
