package anno_main;

import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BergerMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annoXml/Bergerbean.xml");
		
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

		System.out.println(context.getBean("monbs"));
		System.out.println(context.getBean("tongbs"));
		System.out.println(context.getBean("diaPack"));
		System.out.println(context.getBean("tongPack"));

		
		context.close();
	}

}
