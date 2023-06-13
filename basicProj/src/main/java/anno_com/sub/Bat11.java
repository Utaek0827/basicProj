package anno_com.sub;

import org.springframework.stereotype.Component;

import anno_com.Battery;

@Component
public class Bat11 extends Battery {
	
	String kind="베트맨11";

	@Override
	public String toString() {
		return "Bat11 [kind=" + kind + "]";
	}

}

@Component("bat")
class Bat22 extends Battery {
	
	String kind="베트맨22";

	@Override
	public String toString() {
		return "Bat22 [kind=" + kind + "]";
	}

}
