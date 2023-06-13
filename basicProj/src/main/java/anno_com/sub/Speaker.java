package anno_com.sub;

import org.springframework.stereotype.Component;

@Component("spk")
public class Speaker {

	int channel = 2, price = 30000;

	@Override
	public String toString() {
		return "Speaker [channel=" + channel + ", price=" + price + "]";
	}
	
}

@Component // 연속된 대문자 시작은 소문자로 변환하지 않음
class AAA{
	String msg = "이래서 눈치빠른 놈들은 싫다니깐";

	@Override
	public String toString() {
		return "AAA [msg=" + msg + "]";
	}
}
