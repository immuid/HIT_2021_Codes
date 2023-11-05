package module2_week7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoiceGenerator {
	public static void main(String[] args) {
		Items item1=new Items(100,"daal",20,120);
		Items item2=new Items(200,"rice",10,70);
		
		List<Items> items=new ArrayList<Items>();
		items.add(item1);
		items.add(item2);
		
		Invoice inv=new Invoice(1001,new Date(),items,18);
		
		System.out.println(inv);
	}

}
