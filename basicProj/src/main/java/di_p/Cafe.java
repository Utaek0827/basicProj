package di_p;

import java.util.List;
import java.util.Map;
import java.util.Set;



public interface Cafe {
	
	abstract Am am();
	abstract Af af();
	abstract Ai ai();

	abstract AmList amList();
	abstract AfSet afSet();
	abstract AiMap aiMap();

}

class Coffee{
	String name;
	int price;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}


class Am extends Coffee{
		
	@Override
	public String toString() {
		return name+" 아메리카노 가격:"+price+"원";
	}
}

class Af extends Coffee{
	
	@Override
	public String toString() {
		return name+" 아프리카노 가격:"+price+"원";
	}
	
}

class Ai extends Coffee{
	@Override
	public String toString() {
		return name+" 아시아노 가격:"+price+"원";
	}
}

class AmList{
	
	List<Am> res;

	@Override
	public String toString() {
		return "아메리카노들 [res=" + res + "]";
	}
	public void setRes(List<Am> res) {
		this.res = res;
	}	
}

class AfSet{
	
	Set<Af> res;

	@Override
	public String toString() {
		return "아프리카노들 [res=" + res + "]";
	}

	public void setRes(Set<Af> res) {
		this.res = res;
	}	
}

class AiMap{
	
	Map<String,Ai> res;

	@Override
	public String toString() {
		return "아시아노들 [res=" + res + "]";
	}

	public void setRes(Map<String, Ai> res) {
		this.res = res;
	}	
}






