package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIMulxmlMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("qqww/myMulXml1.xml","qqww/myMulXml2.xml");

		System.out.println(context.getBean("en"));
		System.out.println(context.getBean("car1"));
		System.out.println(context.getBean("bike1"));

		
		context.close();
	}

}
