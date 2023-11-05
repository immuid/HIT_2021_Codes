package factorypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class FactoryDemo {
//	public static void main(String[] args) {
//		
//	ShoeShop shop=MySpringContainer.getShoeShop();
//	System.out.println(shop.sellShoe(null));
//	}
}
//class MySpringContainer {
//public static ShoeShop getShoeShop() {
//	ShoeFactory bsf=new LakhaniShoeFactory();
//	ShoeShop shop=new RahimShoeShop();
//	//dependency injection
//	shop.setFactory(bsf);
//	return shop;
//	}
//}
interface Manufacturer{
public Shoe makeShoe();
}
interface Seller{
public Shoe sellShoe(Customer customer);
}
class Customer{}
abstract class Shoe{}
class LeatherShoe extends Shoe{}
class SportsShoe extends Shoe{}

abstract class ShoeFactory implements Manufacturer{}
abstract class ShoeShop implements Seller{
	@Autowired
	@Qualifier("lsf")
private ShoeFactory factory;
public ShoeFactory getFactory() {
	return factory;
}
public void setFactory(ShoeFactory factory) {
	this.factory = factory;
	}

}
@Component("bsf")
class BataShoeFactory extends ShoeFactory{
@Override
public Shoe makeShoe() {
	// TODO Auto-generated method stub
	return new LeatherShoe();
	}
}
@Component("lsf")
class LakhaniShoeFactory extends ShoeFactory{
@Override
public Shoe makeShoe() {
	// TODO Auto-generated method stub
	return new SportsShoe();
	}
}
@Component("rahim")
class RahimShoeShop extends ShoeShop{
@Override
public Shoe sellShoe(Customer customer) {
	// TODO Auto-generated method stub
	return getFactory().makeShoe();
	}
}