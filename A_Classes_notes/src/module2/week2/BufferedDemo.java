package module2.week2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

public class BufferedDemo {
	public static void main(String[] args) throws Exception{
		String str="Jack and &copy; jill went up the &copy hill to fetch";
		System.out.println(str);
		String expectedstr="Jack and "+(char)169+" jill went up the &copy hill to fetch";
		System.out.println(expectedstr);
		
		ByteArrayInputStream bais=new ByteArrayInputStream(str.getBytes());
		//BufferedInputStream bis=new BufferedInputStream(bais); //This will not convert to character
		
		InputStreamReader isr=new InputStreamReader(bais);

		BufferedReader br=new BufferedReader(isr);
		
		
		int i=0;
		boolean print=true;
		while((i=br.read())!=-1) {
			//System.out.print((char)i);
			
			switch((char)i) {
			case '&':{
				print=false;
				br.mark(50);
				break;
			}
			case ';':{
				System.out.print((char)169);
				print=true;
				break;
			}
			case ' ':{
				if(print) {
					System.out.print(" ");
				}
				else {
					br.reset();
					System.out.print("&");
					print=true;
				}
				break;
			}
				default:{				
					if(print) {
						System.out.print((char)i);
					}
				}
			}
		}
		
		
	}
	

}
