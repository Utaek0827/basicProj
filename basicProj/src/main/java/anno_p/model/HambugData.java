package anno_p.model;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.annotation.Resource;

public class HambugData {
	
	@Resource(name = "subi")
	Hambug hb;
	
	@Autowired(required = false)
	Drink drink;

	Side side;
	String name;
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "HambugData [hb=" + hb + ", drink=" + drink + ", side=" + side + ", name=" + name + "]";
	}
}

class Hambug{
	String name,kind;
	int kcal;
	
	
	
	@Override
	public String toString() {
		return "Hambug [name=" + name + ", kind=" + kind + ", kcal=" + kcal + "]";
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
		
}

class Drink{
	String name, size;

	public void setName(String name) {
		this.name = name;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Drink [name=" + name + ", size=" + size + "]";
	}	
	
	
}

class Side{
	String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Side [name=" + name + "]";
	}	
	
	
}