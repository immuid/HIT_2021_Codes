package week_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		//Array
				String s[]=new String[4];
				s[0]="Hai";
				s[1]="Hello";
				s[2]="World";
				//s[3]=new Stone();
				//Arrays are homogeneous -Strictly u can add only one type of data 
				//Array Size is fixed you can not change array size in runtime
				
				for(int i=0;i<s.length;i++) {
					System.out.println(s[i]);
				}
				//New For loop
				for(String st:s) {
					System.out.println(st);
				}
				
		//ArrayList-collections	
		List list=new ArrayList();
		list.add("Hello World");
		list.add("Hai");
		list.add(120);
		list.add(new Stone());
		//Collections are heterogeneous - they can accept any Object Type
		//Collection size is not fixed so u can add as much objects as u can 
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//New For Loop
		for(Object o:list) {
			System.out.println(o);			
		}
		//but collection provides more ways to read
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//cursor created by iterator is forward only cursor and it fails fast -once read it can not be reused
		//ListIterator has an advantage of moving your cursor back and forth
		ListIterator listiter=list.listIterator();
		
		//list.add("aaaaaaaaaaaaaaaa");-You will get a concurrent modification exception 
		//if you add something to the main collection after creating the iterator or listiterator 
		while(listiter.hasNext()) {
			System.out.println(listiter.next());
		}
		while(listiter.hasPrevious()) {
			System.out.println(listiter.previous());
		}
	}

}
class Stone{
	
}