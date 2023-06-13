package anno_main;

import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annoXml/component.xml");
		
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
//		System.out.println(context.getBean("battery"));
		System.out.println(context.getBean("handPhone"));

		
		context.close();
	}

}
