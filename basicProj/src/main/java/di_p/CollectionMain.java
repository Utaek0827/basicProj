package di_p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {

	public static void main(String[] args) {

		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("qqww/myCollectioncon.xml");
		
		ArrayList arr1 = context.getBean("arr1", ArrayList.class);
		System.out.println(arr1);
		
		HashSet<Integer> ss1 = context.getBean("ss1", HashSet.class);		
		System.out.println(ss1);

		HashMap<String,String> mm1 = context.getBean("mm1", HashMap.class);		
		System.out.println(mm1);
		
		ColData cd1 = context.getBean("cd1", ColData.class);	
		System.out.println(cd1);
		
		MultiPhone mph = context.getBean("mph", MultiPhone.class);
				
		System.out.println(mph.name+"===================");
		for (Battery bt : mph.bbs) {
			System.out.println(bt);
		}
		
		System.out.println("===================");
		for (Map.Entry<String, Camera> me : mph.mms.entrySet()) {
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
		context.close();
		
		/*
		 * 도형 클래스를 정의하고
		 * 도형 클래스들을 받아서 리스트로 처리하여 도형 종류별로 정리하는 클래스를 정의하여 
		 * bean 구현하세요.
		 * 
		 */
		
		
	}

}
