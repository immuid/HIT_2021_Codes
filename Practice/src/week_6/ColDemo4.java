package week_6;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
																		//homework - stack and queue
public class ColDemo4 {
	public static void main(String[] args) {
																		//Set<String> set=new HashSet<String>();
		Set<String> set=new TreeSet<String>(new MyComparator());
		set.add("hello");
		set.add("hai");
		set.add("hello");
		set.add("world");
		set.add("earth");
		
		System.out.println(set);
		set.add("zebra");
		set.add("almighty");
		
		System.out.println(set);
		
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		for(String s:set) {
			System.out.println(s);
		}
		int i=10;
		i+=10;//i=i+10;
		System.out.println(i);
	
	}
	
}
class MyComparator implements Comparator<String>{
	
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
}


