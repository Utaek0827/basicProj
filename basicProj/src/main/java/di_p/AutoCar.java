package di_p;

import java.util.ArrayList;
import java.util.List;

public class AutoCar {

	String name;
	AutoWheel fr, fl, br, bl;
	AutoEngine engine;
	List<AutoSheet> sheet;
	AutoWindow win;
	
	public AutoCar() {
		System.out.println("AutoCar 기본 생성자");
	}
	

	// byName 으로 가져오기 : fr, fl
	// byType 으로 가져오기 : en, sheet
	//						  sheet => AutoSheet인 bean을 묶어서 List로 처리
	public AutoCar(AutoEngine en, AutoWheel fr, AutoWheel fl, List<AutoSheet> sheet) {

	//public AutoCar(AutoEngine en, AutoWheel fr, AutoWheel qwer, List<AutoSheet> sheet) {
		System.out.println("AutoCar 사용자 정의 생성자:"+en+","+fr+","+fl+","+sheet);
		this.engine = en;
		this.fr = fr;
		this.fl = fl;
		
		this.sheet = sheet;
	}
	
	// byName 으로 가져오기 : fr, fl
	// byType 으로 가져오기 : en, sheet 열거형은 타입으로 가져온다.
	//	
	public AutoCar(AutoEngine en, AutoWheel fr, AutoWindow win, AutoSheet ... sheet) {

		System.out.println("AutoCar 사용자 정의 생성자 2:"+en+","+fr+","+win+","+sheet);
		this.engine = en;
		this.fr = fr;
		this.win = win;
		
		this.sheet = new ArrayList<>();
		for (AutoSheet sh : sheet) {
			this.sheet.add(sh);
		}
		
	}



	public void setWin(AutoWindow win) {
		this.win = win;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFr(AutoWheel fr) {
		this.fr = fr;
	}
	public void setFl(AutoWheel fl) {
		this.fl = fl;
	}
	public void setWh1(AutoWheel br) {
		this.br = br;
	}
	public void setBl(AutoWheel bl) {
		this.bl = bl;
	}
	public void setEngine(AutoEngine engine) {
		this.engine = engine;
	}
	public void setSheet(List<AutoSheet> sheet) {
		this.sheet = sheet;
	}
	@Override
	public String toString() {
		return "AutoCar [name=" + name + ", fr=" + fr + ", fl=" + fl + ", br=" + br + ", bl=" + bl + ", engine="
				+ engine + ", sheet=" + sheet + ", win=" + win + "]";
	}
}


class AutoWindow{
	int size;

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "AutoWindow [size=" + size + "]";
	}
		
}

class AutoBike{
	
	String name;
	AutoWheel wheel;
	AutoEngine engine;
	AutoSheet sh1;
		
	
	
	
	public AutoBike() {
	}

	public AutoBike(AutoEngine en, AutoWheel wheel, AutoSheet qaz) {
		System.out.println("AutoBike 생성자 1");
		this.engine = en;
		this.wheel = wheel;
		this.sh1 = qaz;
	}
	
	public AutoBike(AutoEngine en, AutoSheet qaz) {
		System.out.println("AutoBike 생성자 2"+en+","+qaz);
		this.engine = en;
		this.sh1 = qaz;
	}
	
	public void setName(String name) {
		this.name = name;
	} 
	public void setFr(AutoWheel wheel) {
		this.wheel = wheel;
	}
	public void setEngine(AutoEngine engine) {
		this.engine = engine;
	}
	public void setQaz(AutoSheet sh1) {
		this.sh1 = sh1;
	}
	@Override
	public String toString() {
		return "AutoBike [name=" + name + ", wheel=" + wheel + ", engine=" + engine + ", sh1=" + sh1 + "]";
	}
}

class AutoTruck{
	
	String name, kind;
	AutoWheel fr, fl, br, bl, s1, s2;
	AutoEngine engine;
	AutoSheet sh2;
	

	public AutoTruck() {
		System.out.println("AutoTruck 기본 생성자");
	}
	
	
	public AutoTruck(AutoWindow win) {
		System.out.println("AutoTruck 생성자 1");
		
	}

	public AutoTruck(AutoWheel fr, AutoWheel fl, AutoEngine ss) {
		System.out.println("AutoTruck 생성자 2");
		this.fr = fr;
		this.fl = fl;
		this.engine = ss;
	}
	
	public AutoTruck(AutoWheel fr, AutoWheel fl, AutoSheet ss) {
		System.out.println("AutoTruck 생성자 3");
		this.fr = fr;
		this.fl = fl;
		this.sh2 = ss;
	}
	
	public AutoTruck(AutoWheel fr, AutoSheet ss, AutoWheel bb) {
		System.out.println("AutoTruck 생성자 4");
		this.fr = fr;
	}
	
	
	
//	public AutoTruck(String kind, AutoWheel ... ss) {
//		System.out.println("AutoTruck 생성자 3");
//		this.kind = kind;
//		this.fr = ss[0];
//		this.fl = ss[1];
//		this.br = ss[2];
//		this.bl = ss[3];
//	}

	


	public void setName(String name) {
		this.name = name;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void setFr(AutoWheel fr) {
		this.fr = fr;
	}
	public void setFl(AutoWheel fl) {
		this.fl = fl;
	}
	public void setBr(AutoWheel br) {
		this.br = br;
	}
	public void setBl(AutoWheel bl) {
		this.bl = bl;
	}
	public void setS1(AutoWheel s1) {
		this.s1 = s1;
	}
	public void setS2(AutoWheel s2) {
		this.s2 = s2;
	}
	
	public void setKl(AutoWheel s2) {
		this.fr = s2;
		this.fl = s2;
		this.br = s2;
		this.bl = s2;
		this.s1 = s2;
		this.s2 = s2;
	}
	
	public void setEngine(AutoEngine engine) {
		this.engine = engine;
	}
	public void setSh2(AutoSheet sh2) {
		this.sh2 = sh2;
	}
	@Override
	public String toString() {
		return "AutoTruck [name=" + name + ", kind=" + kind + ", fr=" + fr + ", fl=" + fl + ", br=" + br + ", bl=" + bl
				+ ", s1=" + s1 + ", s2=" + s2 + ", engine=" + engine + ", sh2=" + sh2 + "]";
	}
}


class AutoWheel{
	String name;
	int size;
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "AutoWheel [name=" + name + ", size=" + size + "]";
	}
}

class AutoEngine{
	String name;
	int power;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "AutoEngine [name=" + name + ", power=" + power + "]";
	}	
}

class AutoSheet{
	String kind;

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "AutoSheet [kind=" + kind + "]";
	}
}



