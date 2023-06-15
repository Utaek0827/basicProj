package aop_main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_model.naver.ZoSuk;
import aop_model.webToon.Gian84;

public class AroundMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("aopXml/aroundXml.xml");

		ZoSuk zoSuk = context.getBean("zoSuk",ZoSuk.class);
		Gian84 gian84 = context.getBean("gian84",Gian84.class);
		
		Object res = zoSuk.dog();
		System.out.println("res : "+ res);
		System.out.println("================================");
		res = zoSuk.zozun("서빙", 9000);
		
		System.out.println("================================");
		res = zoSuk.swd(10);
		
		System.out.println("================================");
		res = zoSuk.swd(0);

		System.out.println("res : "+res);
		System.out.println("================================");
		zoSuk.father();
		System.out.println("================================");
		res = gian84.fashionKing();
		System.out.println("res : "+res);
		
		
		context.close();
	}

}
