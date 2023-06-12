package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LookUpMethodMain {

	public static void main(String[] args) {

		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("qqww/myLookUpMethod.xml");
		
		Seven11 s11 = context.getBean("s11", Seven11.class);
		Cigarette cg;
		s11.order("ai");
//		Cigarette cg =  s11.order("ai");
		
		cg = s11.cig_1();	// lookup-method로 실행 : 클래스에서 정의된 메소드가 아예 실행되지 않음
		System.out.println("cig_1:"+cg);
		
		cg = s11.cig_2();
		System.out.println("cig_2:"+cg);
		
		Object oo = s11.cig_3();
		System.out.println("cig_3:"+oo);
		
		oo = s11.cig_4(100);
		System.out.println("cig_4:"+oo);
		
		oo = s11.cig_5();	// lookup-method로 실행 : 클래스에서 정의된 메소드가 아예 실행되지 않음
		System.out.println("cig_5:"+oo);
		
		oo = s11.cig_7();
		System.out.println("cig_7:"+oo);
		
		oo = s11.cig_8();
		System.out.println("cig_8:"+oo);
		
		oo = s11.cig_9();
		System.out.println("cig_9:"+oo);// abstract : lookup-method를 적용해야만 생성시 에러발생 안함

		s11.total();
		
		// 인터페이스를 bean으로 등록하고 모든 메소드를 lookup-method로 처리 될 경우
		// 구현클래스 없이 bean으로 정의 가능
		System.out.println("gs>>>>>>");
		GS25 gs = context.getBean("gs", GS25.class);
		oo = gs.ggcc();
		System.out.println("ggcc:"+oo);
		
		
		context.close();
		
		/*
		 * Cafe interface를 정의하고
		 * 
		 * am : 아메리카노
		 * af : 아프리카노
		 * ai : 아시아노
		 * 
		 * amList : 아메리카노들
		 * afSet : 아프리카노Set
		 * aiMap : 아시아노Map
		 * 요렇게 리턴되도록 
		 *
		 * */
		
		
	} 

}
