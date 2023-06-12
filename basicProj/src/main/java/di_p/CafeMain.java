package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CafeMain {

	public static void main(String[] args) {

		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("qqww/myCafeCon.xml");
		
		Cafe c1 = context.getBean("c1", Cafe.class);
		
		System.out.println(c1);
		
		
		
		
		Object oo = c1.am();
		System.out.println(oo);
		
		oo = c1.af();
		System.out.println(oo);
		
		oo = c1.ai();
		System.out.println(oo);
		
		oo = c1.amList();
		System.out.println(oo);
		
		oo = c1.afSet();
		System.out.println(oo);
		
		oo = c1.aiMap();
		System.out.println(oo);
		
				
		
	} 

}
