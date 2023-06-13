package anno_main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annoXml/resource.xml");
		
		System.out.println(context.getBean("hbd1"));

		context.close();
	}

}
