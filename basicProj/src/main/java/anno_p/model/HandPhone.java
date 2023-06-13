package anno_p.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HandPhone {
	
	String name;
	int price;
	Camera cam;
	Battery bat;
	

	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Autowired
	@Qualifier("cc2")
	public void setCam(Camera cam) {
		this.cam = cam;
	}
	
	// Autowired를 걸었을 때 해당 객체가 없으면 에러
	// @Autowired(required = false)를 해주면 없어도 에러발생하지않음
	@Autowired(required = false)
	public void setBat(Battery bat) {
		this.bat = bat;
	}
	
	@Override
	public String toString() {
		return "HandPhone [name=" + name + ", price=" + price + ", cam=" + cam + ", bat=" + bat + "]";
	}	
}

class Camera{
	String name;
	int pixel;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	
	@Override
	public String toString() {
		return "Camera [name=" + name + ", pixel=" + pixel + "]";
	}
	
	
	
}

class Battery{
	String kind;

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Battery [kind=" + kind + "]";
	}
	
	
}