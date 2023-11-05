package inheritance;

public class InheritanceDemo2 {
	public static void main(String[] args) {
		Army a1 = new Army1();
		a1.doAttack();
		Army1 a2=new Army1();
		a2.doAttack();
		System.out.println(a1.amt);
	}

}
abstract class Army{
	int amt= 1000;
	final public void doAttack() {
		System.out.println("Attack with Guns....");
	}
}
class Army1 extends Army{
	int amt=2000;
}
class Army2 extends Army{
	
}
