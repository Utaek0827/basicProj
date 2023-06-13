package anno_main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annoXml/required.xml");

		System.out.println(context.getBean("ph1"));
		context.close();
	}

}
