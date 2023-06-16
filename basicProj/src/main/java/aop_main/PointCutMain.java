package aop_main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_model.naver.ZoSuk;
import aop_model.webToon.Gian84;

public class PointCutMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("aopXml/pointCutXml.xml");

		ZoSuk zoSuk = context.getBean("zoSuk",ZoSuk.class);
		Gian84 gian84 = context.getBean("gian84",Gian84.class);
		
		Object res;
		
		System.out.println("-----------------------");
		res = zoSuk.dog();
		System.out.println("res"+res);
		System.out.println("-----------------------");
		res = zoSuk.zozun("알바",5000);
		System.out.println("res"+res);
		System.out.println("-----------------------");
		res = zoSuk.mother();
		System.out.println("res"+res);
		System.out.println("-----------------------");
		zoSuk.father();
		System.out.println("-----------------------");
		res = gian84.fashionKing();
		System.out.println("-----------------------");

		context.close();
	}

}
