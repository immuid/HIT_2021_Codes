package demo_practice_area;

public class EscapeSequenceDemo {
	public static void main(String[] args) {
		
		System.out.println("jack and jim went \"up\" the hill");
		System.out.println("jack and jim went 'up' the hill");
		System.out.println("jack and jim went \\up\\ the hill");
		System.out.println("jack and jim went \n up\n the hill");
		System.out.println("jack and jim went \f up\f the hill");
		System.out.println("Hello\b\b\b\b a");
		
		int i=1;
		while(true) {
			i++;
			if(i<1000000) {
				System.out.println(i+"\r");
				try {Thread.sleep(100);}catch(Exception e) {}
			}
		}
	}

}
