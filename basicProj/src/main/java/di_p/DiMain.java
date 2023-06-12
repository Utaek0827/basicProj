package di_p;

import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("di 안녕?");
		
		HandPhone hp1 = new HandPhone();
		Camera cr1 = new Camera();
		Camera cr2 = new Camera();
		Battery bb1 = new Battery();
		
		hp1.fc = cr1;
		hp1.bc = cr2;
		hp1.bat = bb1;
		
		cr1.name = "작은카메라";
		cr2.name = "큰카메라";
		cr1.pixel = 10;
		cr2.pixel = 20;
		bb1.name = "작은배터리";
		bb1.plugin = false;
		hp1.name = "은하수";
		hp1.price = 50;
		System.out.println("hp1:"+hp1);
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("qqww/myDiCon.xml");
		
		//bean 이름들 
		String [] names = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(names));
		
		//System.out.println("bbC1:"+context.getBean("bbC1"));
		//Camera bbc1 = context.getBean("bbC1");
		//Camera bbC1 = (Camera)context.getBean("bbC1");
		
		Camera bbC1 = context.getBean("bbC1", Camera.class);
		System.out.println("bbC1:"+bbC1);
				
		System.out.println("bbHp1:"+context.getBean("bbHp1"));
		
		
		context.close();
		
		

	}

}
