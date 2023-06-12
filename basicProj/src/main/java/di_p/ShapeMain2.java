package di_p;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeMain2 {

	public static void main(String[] args) {

		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("qqww/myShape2Con.xml");

		
		MultiShape mph = context.getBean("msp", MultiShape.class);

		
		for (Entry<String, ArrayList<Shape2>> me : mph.mms.entrySet()) {
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
		
		
//		
//		
//		MultiShape2 mph2 = context.getBean("msp2", MultiShape2.class);
//		
//		for (Shape2 sh : mph2.bbs) {
//			if(sh.name.equals("원")) {
//				System.out.println(sh);
//			}
//			if(sh.name.equals("직사각형")) {
//				System.out.println(sh);
//			}
//			if(sh.name.equals("직각삼각형")) {
//				System.out.println(sh);
//			}
//		}
	}

}
