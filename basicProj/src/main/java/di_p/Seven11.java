package di_p;

public abstract class Seven11 {
	
	void order(String aa) {
		System.out.println(aa+"주문");
	}

	Cigarette cig_1() {
		System.out.println("Seven11.cig_1() 실행");
		return new Cigarette("솔",500);
	}
	
	Cigarette cig_2() {
		System.out.println("Seven11.cig_2() 실행");
		return new Cigarette("88",800);
	}
	
	String cig_3() {
		System.out.println("Seven11.cig_3() 실행");
		return "무너무너";
	}
	
	Cigarette cig_4(int aa) {
		System.out.println("Seven11.cig_4() 실행:"+aa);
		return new Cigarette("에쎼",4000);
	}
	
	Cigarette cig_5() {
		System.out.println("Seven11.cig_5() 실행");
		return new Cigarette("거북선",4000);
	}
	
	private Cigarette cig_6() {
		System.out.println("Seven11.cig_6() 실행");
		return new Cigarette("태양",200);
	}
	
	final Cigarette cig_7() {
		System.out.println("Seven11.cig_7() 실행");
		return new Cigarette("마일드세븐",7000);
	}
	
	static Cigarette cig_8() {
		System.out.println("Seven11.cig_8() 실행");
		return new Cigarette("아리랑",1234);
	}
	
	abstract Cigarette cig_9();
	
	void total() {
		System.out.println("total 시작------------");
		
		Cigarette rt = cig_6();
		System.out.println("cig_6:"+rt);
		System.out.println("total 끝------------");

	}
}


class Cigarette{
	String name;
	int price;
	
	public Cigarette(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Cigarette [name=" + name + ", price=" + price + "]";
	}
}


interface GS25{
	Cigarette ggcc();
}






