package anno_com;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class BeanInit {

	@Bean
	BiWheel wh1(){
		BiWheel res = new BiWheel();
		res.name = "산악바퀴";
		return res;
	}
	
	@Bean
	Bihandle hd1(){
		Bihandle res = new Bihandle();
		res.name = "일자핸들";
		return res;
	}
	
	//@Bean bean은 멤버변수에서 정의 불가
	//Bihandle hd2 = hd1();
	
	Bihandle hd3(){ //메소드는 bean으로 등록된 메소드의 매개변수에서 호출안함
		Bihandle res = new Bihandle();
		res.name = "삼자핸들";
		return res;
	}
	
	@Bean
	Bihandle hd4(){ //메소드는 bean으로 등록된 메소드의 매개변수에서 호출안함
		Bihandle res = new Bihandle();
		res.name = "삼자핸들";
		return res;
	}
	
	@Bean
	Bihandle hd5(){ 
		Bihandle res = new Bihandle();
		res.name = "오자핸들";
		return res;
	}
	
	@Bean
	Bihandle hd6(){
		Bihandle res = new Bihandle();
		res.name = "육자핸들";
		return res;
	}
	
	
	@Bean(name="cy1")
	Bicycle cycle1(){
		Bicycle res = new Bicycle();
		res.name = "삼천리";
		res.ss = new BiSheet();
		res.ss.name = "중국산";
		
		// Bicycle의 ww가 autowire 설정되어 바뀌게 됨
		res.ww = new BiWheel(); // autowire
		res.ww.name = "도시바퀴";
		// 도시바퀴 -> 산악바퀴
		
		System.out.println("res.ww.name"+res.ww.name);
		
		return res;
	}
	
	@Bean
	Bicycle cycle2(){
		Bicycle res = new Bicycle();
		res.name = "무궁화";
		res.ss = new BiSheet();
		res.ss.name = "백두산";
		
		return res;
	}
	
	//bean을 매개변수로 가져오는 경우
	@Bean
	Bicycle cycle3(Bihandle hd1){ 
		
		// bean으로 정의한 메소드의 매개변수는 ref,autowire 처럼 bean을 가져온다
		// hd1 : bean (우선순위 : byName > byType)
		// 일반메소드나 멤버변수로 넣을수 없다.
		
		Bicycle res = new Bicycle();
		res.name = "화려강산";
		res.ss = new BiSheet();
		res.ss.name = "용각산";
		res.hh = hd1; //실제 property는 직접 명시해야한다.
		
		return res;
	}
	
	@Bean
	Bicycle cycle4(Bihandle hd1, Bihandle hd4){ 
		
		Bicycle res = new Bicycle();
		res.name = "대한사람";
		System.out.println("cycle4 실행 : "+hd1+","+hd4);

		return res;
	}
	
	@Bean
	Bicycle cycle5(Bihandle ...arr){ //가변 매개변수로 만든 BiHandle 인 bean을 배열로 가져옴
		
		Bicycle res = new Bicycle();
		res.name = "대한으로";
		System.out.println("cycle5 실행 : "+ Arrays.toString(arr));

		return res;
	}
	
	@Bean
	void wh2() {
		BiWheel res = new BiWheel();
		res.name = "산악바퀴2";
	}
	
	//xml에서 정의한 bean을 매개변수로 호출가능
	@Bean
	Bicycle cycle6(Bihandle hd8, Bihandle hd4){ 
		
		Bicycle res = new Bicycle();
		res.name = "길이보전";
		System.out.println("cycle6 실행 : "+hd8+","+hd4);

		return res;
	}
	
}

class Bicycle {
	String name;
	BiWheel ww;
	Bihandle hh;
	BiSheet ss;
	
	public void setName(String name) {
		this.name = name;
	}

	@Autowired //bean 정의시 자동으로 가져옴
	//@bean으로 정의된 인스턴스의 멤버는 property init 과정에서 autowired되어 ww인 bean으로 교체됨
	public void setWw(BiWheel ww) {
		this.ww = ww;
	}

	@Override
	public String toString() {
		return "Bicycle [name=" + name + ", ww=" + ww + ", hh=" + hh + ", ss=" + ss + "]";
	}
	
}

class BiWheel{
	String name;

	@Override
	public String toString() {
		return "BiWheel [name=" + name + "]";
	}

}

class Bihandle{
	
	String name;
	
	

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Bihandle [name=" + name + "]";
	}
	
}
class BiSheet{

	String name;

	@Override
	public String toString() {
		return "BiSheet [name=" + name + "]";
	}
	
}