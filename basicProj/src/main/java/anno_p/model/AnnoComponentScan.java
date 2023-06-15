package anno_p.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = "anno_com") //패키지 스캔
@ImportResource("annoXml/imppp.xml") //xml 적용
public class AnnoComponentScan {
	
	@Bean // 호출가능
	Fish tuna() {
		return new Fish("참치");
	}
	
	@Component// ApplicationContext 내부 클래스 bean정의 불가
	class Tiger{
		
	}

}

@Component //ApplicationContext 클래스와 같이 정의되었어도 bean 등록 불가
class Shark{
	String name = "백상어";

	@Override
	public String toString() {
		return "Shark [name=" + name + "]";
	}
	
}

class Fish{
	String name;
	
	public Fish(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Fish [name=" + name + "]";
	}
	
}