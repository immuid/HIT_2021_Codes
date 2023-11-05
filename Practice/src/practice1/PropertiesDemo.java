package practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) throws Exception {
		
		Properties prop=new Properties(); 
		
		//prop.put("a1","Hello World");
		//prop.put("a2","Hai world");
		prop.load(new FileInputStream("confiure.properties")); 
		System.out.println(prop.get("a1"));
		 Set set=prop.entrySet();
		 Iterator iter=set.iterator();
		 while (iter.hasNext()) {
			Map.Entry me=(Map.Entry)iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
			
		}
	}
}
