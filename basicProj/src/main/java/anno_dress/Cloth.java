package anno_dress;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class Cloth {
	
	String name;
	Top top;
	Pants pants;
	public void setName(String name) {
		this.name = name;
	}
	public void setTop(Top top) {
		this.top = top;
	}
	public void setPants(Pants pants) {
		this.pants = pants;
	}
	
	@Override
	public String toString() {
		return "Cloth [name=" + name + ", top=" + top + ", pants=" + pants + "]";
	}		
}

@Component
class Ski{
	
	String name;
	Top top;
	Pants pants;
	
	public Ski() {
		this.name = "스키";
		
		this.top = new Top();
		top.kind = "스키복 상의";
		top.name = "노스페이스";
		
		this.pants = new Pants();
		pants.kind = "스키복 하의";
		pants.name = "노스페이스";
	}

	@Override
	public String toString() {
		return "ski [name=" + name + ", top=" + top + ", pants=" + pants + "]";
	}
}

@Component
class Traking{
	
	String name;
	Top top;
	Pants pants;
	
	public Traking() {
		this.name = "등산복";
		
		this.top = new Top();
		top.kind = "등산복 상의";
		top.name = "ACG";
		
		this.pants = new Pants();
		pants.kind = "등산복 하의";
		pants.name = "ACG";
	}

	@Override
	public String toString() {
		return "Traking [name=" + name + ", top=" + top + ", pants=" + pants + "]";
	}
}

class Top{
	
	String kind;
	String name;
	
	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[kind=" + kind + ", name=" + name + "]";
	}
}

class Pants{
	
	String kind;
	String name;
	
	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[kind=" + kind + ", name=" + name + "]";
	}	
}