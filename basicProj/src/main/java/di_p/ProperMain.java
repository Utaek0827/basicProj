package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProperMain {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("qqww/myProper.xml");
		
		System.out.println(context.getBean("st1")); 
		System.out.println(context.getBean("st2")); 

		
		
		context.close();
		
	}

}


