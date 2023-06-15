package anno_main;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import anno_p.model.AnnoComponentScan;

public class ComponentClassMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnoComponentScan.class);
		
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		System.out.println(context.getBean("tuna"));

		System.out.println(context.getBean("handPhone"));
		System.out.println(context.getBean("fanta"));

		
//		System.out.println(context.getBean("tiger"));


	}

}
