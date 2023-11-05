package factorypack;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class FactoryClient {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= new ClassPathXmlApplicationContext("anno-config.xml");
		
		ShoeShop shop=ctx.getBean("rahim",ShoeShop.class);
		
		Customer customer=new Customer();
		
		System.out.println(shop.sellShoe(customer));
	}
}