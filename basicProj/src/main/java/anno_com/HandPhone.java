package anno_com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import anno_com.sub.Speaker;
import jakarta.annotation.Resource;

// 클래스 이름에서 제일 앞에 있는 글자만 바꿔준다. (대문자 => 소문자)
// 연속된 대문자 시작은 소문자로 변환하지 않음
@Component
public class HandPhone {
	
	String name = "어른폰";
	
	@Resource
	CAmeRa cam;
	
	@Autowired
	Battery bat;
	
	@Resource
	Speaker speaker;
	
	@Override
	public String toString() {
		return "HandPhone [name=" + name + ", cam=" + cam + ", bat=" + bat + ", speaker=" + speaker + "]";
	}
}

@Component
class CAmeRa{

	String name="전방카메라";
	int pixcel=1200;
	
	
	@Override
	public String toString() {
		return "Camera [name=" + name + ", pixcel=" + pixcel + "]";
	}
}


