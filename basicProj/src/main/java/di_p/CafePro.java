package di_p;

import java.util.HashMap;

public class CafePro {
	
	HashMap<String, Integer> menu;

	public void setMenu(HashMap<String, Integer> menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "[menu=" + menu + "]";
	}
	
}

class Order{
	
	CafePro cp;
	String menu;
	int cnt;
		
	public void setMenu(String menu) {
		
		this.menu = menu;
	}
	
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	public void setCp(CafePro cp) {
		this.cp = cp;
	}

	@Override
	public String toString() {
		
		return "[menu=" + menu + ", cnt=" + cnt + ", price=" + cp.menu.get(menu)*cnt + "]";
	}
	
	
	
	
}
