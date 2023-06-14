package anno_com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class BergerKing {
	@Bean
	Berger bg1() {
		
		Berger res = new Berger();
		res.name = "몬스터X";
		res.kind = "비프";
		return res;
	}
	@Bean
	Berger bg2() {
		
		Berger res = new Berger();
		res.name = "통새우와퍼";
		res.kind = "해물";
		return res;
	}
	@Bean
	Side Side1() {
		
		Side res = new Side();
		res.name = "감자튀김";
		return res;
	}
	@Bean
	Drink drink1() {
		
		Drink res = new Drink();
		res.name = "제로콜라";
		res.size = "L";
		return res;
	}
	
	@Bean
	Dessert dessert1() {
		
		Dessert res = new Dessert();
		res.name = "아이스크림";
		return res;
	}
	
	@Bean
	Dessert dessert2() {
		
		Dessert res = new Dessert();
		res.name = "스무디";
		return res;
	}
	
	@Bean
	BergerSet monbs(Berger bg1,Side side1,Drink drink1) {
		
		BergerSet res = new BergerSet();
		res.buger = bg1;
		res.side = side1;
		res.drink = drink1;
		
		return res;
	}
	
	@Bean
	BergerSet monbs2(Berger bg1,Side side1,Drink drink1) {
		
		BergerSet res = new BergerSet();
		res.buger = bg1;
		res.side = side1;
		res.drink = drink1;
		
		return res;
	}
	
	@Bean
	BergerSet tongbs(Berger bg2,Side side1,Drink drink1) {
		
		BergerSet res = new BergerSet();
		res.buger = bg2;
		res.side = side1;
		res.drink = drink1;
		
		return res;
	}
	
	@Bean
	BergerSet tongbs2(Berger bg2,Side side1,Drink drink1) {
		
		BergerSet res = new BergerSet();
		res.buger = bg2;
		res.side = side1;
		res.drink = drink1;
		
		return res;
	}
	
	@Bean
	BergerPack1 diaPack() {
		
		BergerPack1 res = new BergerPack1();

		return res;
	}
	
	@Bean
	BergerPack2 tongPack(BergerSet monbs, BergerSet tongbs, Dessert dessert1) {
		
		BergerPack2 res = new BergerPack2();
		ArrayList arr = new ArrayList();
		arr.add(monbs);
		arr.add(tongbs);
		res.set = arr;
		
		arr = new ArrayList();
		arr.add(dessert1);
		res.dessert = arr;


		return res;
	}
	
	
	
	
	
}


class BergerPack1 {
	
	@Autowired
	List<BergerSet> set;
	@Autowired
	List<Dessert> dessert;
	
	@Override
	public String toString() {
		return "BergerPack [set=" + set + ", dessert=" + dessert + "]";
	}
}

class BergerPack2 {
	
	List<BergerSet> set;
	List<Dessert> dessert;
	
	@Override
	public String toString() {
		return "BergerPack [set=" + set + ", dessert=" + dessert + "]";
	}
}

class BergerSet {
	
	Berger buger;	
	Side side;
	Drink drink;
		
	@Override
	public String toString() {
		return "BergerSet [buger=" + buger + ", side=" + side + ", drink=" + drink + "]";
	}
}



class Berger {
	String name;
	String kind;
	
	@Override
	public String toString() {
		return "Berger [name=" + name + ", kind=" + kind + "]";
	}
}

class Side {
	String name;

	@Override
	public String toString() {
		return "Side [name=" + name + "]";
	}

}

class Drink {
	String name;
	String size;
	
	@Override
	public String toString() {
		return "Drink [name=" + name + ", size=" + size + "]";
	}
}

class Dessert {
	String name;

	@Override
	public String toString() {
		return "Dessert [name=" + name + "]";
	}

}
