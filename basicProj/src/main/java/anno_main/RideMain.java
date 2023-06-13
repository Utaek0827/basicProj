package anno_main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RideMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annoXml/requiredCar.xml");
		
		System.out.println(context.getBean("car1"));
		System.out.println(context.getBean("bike1"));

		
		context.close();
	}

}
