package aop_main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_model.exam.Exam;
import aop_model.naver.ZoSuk;
import aop_model.webToon.Gian84;

public class ExamMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("aopXml/examXml.xml");

		Exam exam = context.getBean("exam",Exam.class);
		
		System.out.println(exam.mid("홍길동", 89,79,64));
		System.out.println(exam.last("에러길동", 101,79,84));
		System.out.println(exam.test("적길동", 90,56,44));
		System.out.println(exam.mid("에러길동2", 12,-1,55));
		System.out.println(exam.mid("미드길동", 100,79,84,90));

		
		context.close();
	}

}
