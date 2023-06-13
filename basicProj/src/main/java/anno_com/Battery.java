package anno_com;

import org.springframework.stereotype.Component;

@Component
public class Battery {
	
	String kind="로케트배터리";

	@Override
	public String toString() {
		return "Battery [kind=" + kind + "]";
	}
}
