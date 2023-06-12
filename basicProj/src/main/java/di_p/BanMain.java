package di_p;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BanMain {

	public static void main(String[] args) {

		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("qqww/myBanCon.xml");
		
		Ban ban1 = context.getBean("ban1",Ban.class);
		System.out.println("1반");
		for (Stu stu : ban1.studs) {
			System.out.println(stu);
		}
		
		Ban ban2 = context.getBean("ban2",Ban.class);
		System.out.println("2반");
		for (Stu stu : ban2.studs) {
			System.out.println(stu);
		}
		
		
		
	}

}
