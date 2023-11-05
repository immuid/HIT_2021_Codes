package week_6;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropRev {
	public static void main(String[] args) {
		Properties prop=new Properties();
		prop.put("key", "Hi buddy");
		prop.put("key2","How are You");
		prop.put("key 3","i'm fine");
		
		//1st method
		System.out.println(prop.get("key"));
		System.out.println("_________________");
		//2nd method
		Enumeration e=prop.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
			System.out.println("______________");
			
			Set set =prop.entrySet();
			Iterator iter =set.iterator();
			while(iter.hasNext()) {
				Map.Entry me=(Map.Entry)iter.next();
				System.out.println(me.getKey()+":"+me.getValue());
			}
			
		
	}

}
