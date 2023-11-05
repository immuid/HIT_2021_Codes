package week_6;

public class GenericRevision {
	public static void main(String[] args) {
		Child3<Ball1>child3=new Child3<>();
		child3.setObj(new Ball1());
		child3.getObj().play();
		
		
		Child3<Sweet> child33=new Child3<>();
		child33.setObj(new Sweet());
		child33.getObj().eat();		
	}
	
}
class Ball1{
	public void play() {
		System.out.println("Playing with the ball...");
	}
}
class Sweet{
	public void eat() {
		System.out.println("Eating the sweet...");
	}
}
//Approch 1
class Child{
	Ball1 ball;
	public void action() {
		ball.play();
	}
}
//Approch 2
class Child2{
	Object obj;
	public void action() {
		if(obj instanceof Ball1) {
			Ball1 ball=(Ball1)obj;
			ball.play();
		}else if(obj instanceof Sweet) {
			Sweet sweet=(Sweet)obj;
			sweet.eat();
		}		
	}
}
//Approch 3
class Child3<T>{
	T obj;
	public void setObj(T obj) {
		this.obj=obj;		
	}
	public T getObj() {
		return this.obj;
	}
	
}