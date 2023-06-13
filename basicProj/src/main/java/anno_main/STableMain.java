package anno_main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class STableMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annoXml/SulResource.xml");

		System.out.println(context.getBean("sd1"));
		System.out.println(context.getBean("sd2"));
		System.out.println(context.getBean("sd3"));
		System.out.println(context.getBean("sd4"));

		
		context.close();
	}

}
