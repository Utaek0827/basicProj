package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstMain {

	public static void main(String[] args) {

		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("qqww/myConCon.xml");
		
		System.out.println(context.getBean("hp1"));
		System.out.println(context.getBean("hp2"));
		System.out.println(context.getBean("hp3"));
		System.out.println(context.getBean("hp4"));
		System.out.println(context.getBean("hp5"));
		System.out.println(context.getBean("hp6"));
//		System.out.println(context.getBean("hp7"));


		context.close();
		
	}

}
