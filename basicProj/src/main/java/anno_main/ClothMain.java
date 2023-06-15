package anno_main;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import anno_p.model.AnnoComponentScan;
import anno_p.model.ClothScan;

public class ClothMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ClothScan.class);
		
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		
		System.out.println(context.getBean("ski"));
		System.out.println(context.getBean("traking"));
		System.out.println(context.getBean("swim"));
		System.out.println(context.getBean("wedding"));




	}

}
