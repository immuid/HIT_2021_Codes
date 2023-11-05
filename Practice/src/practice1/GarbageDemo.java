package practice1;

import java.util.Map;
import java.util.WeakHashMap;

public class GarbageDemo {
	public static void main(String[] args) {
		Map<String , String > wmap=new WeakHashMap<String, String>();
		
		String key1=new String("a1");
		String key2=new String("a2");
		
		wmap.put(key1,"Hello World");
		wmap.put(key2, "Hai World ");
		
		System.out.println(wmap);
		key1=null;
		System.gc();
		System.out.println(wmap);
	}
}
