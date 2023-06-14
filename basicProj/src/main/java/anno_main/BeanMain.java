package anno_main;

import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annoXml/bean.xml");
		
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		System.out.println(context.getBean("wh1"));
		System.out.println(context.getBean("wh2"));

		System.out.println(context.getBean("cy1"));
		System.out.println(context.getBean("cycle2"));
		System.out.println(context.getBean("cycle3"));
		System.out.println(context.getBean("cycle4"));


		
		context.close();
	}

}
