package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("qqww/myCom.xml","qqww/myComModule.xml");

		
		System.out.println(context.getBean("serverCom"));
		System.out.println(context.getBean("note1"));
		System.out.println(context.getBean("tablet1"));

		context.close();
	}
	

}
