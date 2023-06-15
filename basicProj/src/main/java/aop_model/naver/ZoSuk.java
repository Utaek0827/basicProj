package aop_model.naver;

import org.springframework.stereotype.Component;

@Component
public class ZoSuk {

	public String dog() {
		System.out.println("dog() 실행");
		return "센세이션";
	}
	
	public String zozun(String alba, int pay) {
		System.out.println("zozun() 실행");
		return "영점조절";
	}
	
	public void father() {
		System.out.println("아버지는 조철왕 실행");
	}
	
	public String swd(int no) {
		System.out.println("swd() 실행" + 100/no);
		return "서울대";
	}
	
	
}
