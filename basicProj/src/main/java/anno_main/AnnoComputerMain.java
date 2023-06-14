package anno_main;

import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoComputerMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annoXml/comcom.xml");
		
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		System.out.println(context.getBean("computer"));
		System.out.println(context.getBean("server"));
		System.out.println(context.getBean("noteBook"));
		System.out.println(context.getBean("tablet"));

		
		context.close();
	}

}
