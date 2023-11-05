package com;

import java.net.URL;
import java.net.URLConnection;

public class JavaClient {
	public static void main(String[] args) throws Exception{
		URL url=new URL("http://localhost:8080/evewebproj/login.do");
		URLConnection urlcon=url.openConnection();
		urlcon.getInputStream();
	}
	
	}


