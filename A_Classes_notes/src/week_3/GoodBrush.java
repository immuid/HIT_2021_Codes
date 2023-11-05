package week_3;

/* *. Bad - Code which is open for modification and closed for extension.- Bad Brush
 * *. Good- Code which is closed for modification and opened for extension.-Good Brush
 * 
 * *. Whenever you find if-else-if conditions then apply this solution:
 * 1. Convert the conditions into classes.
 * 2. Group them into a hierarchy.
 * 3. Create an association between using class(brush) and the hierarchical classes(paint).
 * 
 */

public class GoodBrush {
	public static void main(String[] args) {
		GoodPaintBrush brush=new GoodPaintBrush();
		RedPaint rp=new RedPaint();
		BluePaint bp=new BluePaint();
		GreenPaint gp=new GreenPaint();
		brush.p=gp;		
		brush.doPaint();
	}
}
class GoodPaintBrush{
	Paint p;
	public void doPaint() {
		System.out.println(p);
	}
}
class Paint{
	
}
class RedPaint extends Paint{
	
}
class GreenPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}