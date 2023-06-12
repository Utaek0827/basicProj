package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeMain {

	public static void main(String[] args) {

		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("qqww/myShapeCon.xml");
		
		System.out.println(context.getBean("one"));
		System.out.println(context.getBean("rac"));
		System.out.println(context.getBean("try"));

		
	}

}
