package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CafeMainPro {

	public static void main(String[] args) {
		
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("qqww/myCafePro.xml");
		
		System.out.println(context.getBean("menu"));
		
		System.out.println("order1:"+context.getBean("order1"));
		System.out.println("order2:"+context.getBean("order2"));
		System.out.println("order3:"+context.getBean("order3"));
		System.out.println("order4:"+context.getBean("order4"));
		System.out.println("order5:"+context.getBean("order5"));
		System.out.println("order6:"+context.getBean("order6"));

		
		context.close();
		
	}

}
