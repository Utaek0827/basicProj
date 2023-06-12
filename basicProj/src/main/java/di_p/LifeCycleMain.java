package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("qqww/myLifeCycle.xml");
		
//		System.out.println("cam1:"+context.getBean("cam1"));
		
		
//		System.out.println("7. ww1:"+context.getBean("ww1"));
		
		for (String st : context.getBeanDefinitionNames()) {
			System.out.println(st+":"+context.getBean(st));
		}
		
		context.close();
		
	}

}
