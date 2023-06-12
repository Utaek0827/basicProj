package di_p;

import java.util.ArrayList;
import java.util.LinkedHashMap;

class Camera{
	String name;
	int pixel;
	
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setPixel(int pixel) {
		this.pixel = pixel;
	}


	Camera(){
		System.out.println("카메라 생성자");
	}
	
	
	@Override
	public String toString() {
		return "Camera [name=" + name + ", pixel=" + pixel + "]";
	}
	

	
}
class Battery{
	String name;
	boolean plugin;
	
	@Override
	public String toString() {
		return "Battery [name=" + name + ", plugin=" + plugin + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPlugin() {
		return plugin;
	}

	public void setPlugin(boolean plugin) {
		this.plugin = plugin;
	}
	
	
	
	
}

class MultiPhone{
	ArrayList<Battery> bbs;
	LinkedHashMap<String, Camera> mms;
	String name;

	public void setBbs(ArrayList<Battery> bbs) {
		this.bbs = bbs;
	}

	public void setMms(LinkedHashMap<String, Camera> mms) {
		this.mms = mms;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MultiPhone [bbs=" + bbs + ", mms=" + mms + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}
	
}



public class HandPhone {
	Camera fc, bc;
	Battery bat;
	String name;
	int price;
	
	public HandPhone() {

	}
		
	public HandPhone(String name) {
		super();
		this.name = name;
	}
	
	public HandPhone(int price) {
		super();
		this.price = price;
	}

	public HandPhone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public HandPhone(String name, Camera fc, Battery bat) {
		super();
		this.fc = fc;
		this.bat = bat;
		this.name = name;
	}

	public void setFc(Camera fc) {
		this.fc = fc;
	}


	public void setBc(Camera bc) {
		this.bc = bc;
	}


	public void setBat(Battery bat) {
		this.bat = bat;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "HandPhone [fc=" + fc + ", bc=" + bc + ", bat=" + bat + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
