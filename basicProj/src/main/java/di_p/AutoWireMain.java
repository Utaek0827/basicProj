package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireMain {

	public static void main(String[] args) {

		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("qqww/myAutoWireCon2.xml");
//		
		System.out.println(context.getBean("car1"));
		System.out.println(context.getBean("car2"));
		System.out.println(context.getBean("car3"));
		System.out.println(context.getBean("car4"));

		
		System.out.println(context.getBean("bike1"));
		System.out.println(context.getBean("bike2"));
//
		System.out.println("======트럭=====");
		System.out.println(context.getBean("tr1"));
		System.out.println(context.getBean("tr2"));
		System.out.println(context.getBean("tr3"));
		System.out.println(context.getBean("tr4"));
		System.out.println(context.getBean("tr5"));

		
		context.close();
		
	}

}
