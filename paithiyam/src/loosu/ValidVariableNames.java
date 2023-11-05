package loosu;

public class ValidVariableNames {
	public static void main(String[] args) {
		//VALID NAME OR IDENTIFIERS
		
		int height;//valid name
		int _height;//valid name - names can start or have _
		int $height;//valid name - names can start or have $
		int hei2ght;//valid name - names can have number in between or at end but not at start
		int yuva_shree;
		//int 2height;//invalid
		int height2;//valid
		
		//int %height;//names cannot start with anyother special character other than _ or $ - invalid
		
		//int hei ght;//names cannot have space in between - invalid
		
		//int void;//invalid - names cannot be keywords
		
		int yuvaShree;
		char c=97;
		System.out.println(c);
		
	}
}