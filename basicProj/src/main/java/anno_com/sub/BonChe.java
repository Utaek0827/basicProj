package anno_com.sub;

import org.springframework.stereotype.Component;

@Component
public class BonChe {
	
	String kind="이쁜본체1";

	@Override
	public String toString() {
		return "BonChe [kind=" + kind + "]";
	}

}

@Component("bonChe1")
class BonChe1 extends BonChe{
	
	String kind="이쁜본체2";

	@Override
	public String toString() {
		return "BonChe [kind=" + kind + "]";
	}
}

