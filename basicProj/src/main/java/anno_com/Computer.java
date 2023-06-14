package anno_com;

import org.springframework.stereotype.Component;

import anno_com.sub.BonChe;
import jakarta.annotation.Resource;

@Component
public class Computer {
	
	String name="데스크탑";
	@Resource
	BonChe bonChe;
	@Resource
	Moniter moniter;
	@Resource
	KeyBoard keyBoard;
	@Resource
	Mouse mouse;
	
	@Override
	public String toString() {
		return "Computer [name=" + name + ", bonChe=" + bonChe + ", moniter=" + moniter + ", keyBoard=" + keyBoard
				+ ", mouse=" + mouse + "]";
	}
}

@Component
class Server {
	
	String name="서버";
	@Resource
	BonChe bonChe;
	
	@Resource(name = "bonChe1")
	BonChe bonChe1;
	@Resource
	Moniter moniter;
	@Resource
	KeyBoard keyBoard;
	@Resource
	Mouse mouse;
	
	@Override
	public String toString() {
		return "Server [name=" + name + ", bonChe1=" + bonChe1 + ", bonChe2=" + bonChe + ", moniter=" + moniter + ", keyBoard=" + keyBoard
				+ ", mouse=" + mouse + "]";
	}
}

@Component
class NoteBook {
	
	String name="노트북";
	@Resource
	BonChe bonChe;
	@Resource
	KeyBoard keyBoard;
	@Resource
	Mouse mouse;
	
	@Override
	public String toString() {
		return "NoteBook [name=" + name + ", bonChe=" + bonChe + ", keyBoard=" + keyBoard + ", mouse=" + mouse + "]";
	}
}

@Component
class Tablet {
	
	String name="태블릿";
	@Resource
	BonChe bonChe;
	
	@Override
	public String toString() {
		return "Tablet [name=" + name + ", bonChe=" + bonChe + "]";
	}
}


@Component
class Moniter {
	
	String kind="이쁜모니터";

	@Override
	public String toString() {
		return "Moniter [kind=" + kind + "]";
	}
}

@Component
class KeyBoard {
	
	String kind="이쁜키보드";

	@Override
	public String toString() {
		return "KeyBoard [kind=" + kind + "]";
	}
}

@Component
class Mouse {
	
	String kind="이쁜마우스";

	@Override
	public String toString() {
		return "Mouse [kind=" + kind + "]";
	}
}










