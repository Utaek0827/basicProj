package di_p;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Shape2 {

	String name = "";
	int border,area;
	
	public Shape2(int x) {
		Circle2 one = new Circle2(x);
		this.name = one.name;
		this.border = one.border;
		this.area = one.area;
		
	}
	
	public Shape2(int x, int y) {
		Ractangle2 rac = new Ractangle2(x,y);
		this.name = rac.name;
		this.border = rac.border;
		this.area = rac.area;
	}
	
	public Shape2(int x, int y, int z) {
		Tryangle2 ttt = new Tryangle2(x,y,z);
		this.name = ttt.name;
		this.border = ttt.border;
		this.area = ttt.area;
	}

	
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setBorder(int border) {
		this.border = border;
	}

	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", border=" + border + ", area=" + area + "]";
	}

}

class Circle2{
	String name;
	int border,area;
	int x;
	
	double pi = 3.14;
	
	public Circle2() {

	}

	public Circle2(int x) {
		name = "원";
		this.x = x;
		border = (int)(pi * 2 * x);
		area = (int)(pi * pi * x);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBorder(int border) {
		this.border = border;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}
	

	@Override
	public String toString() {
		return "Circle2 [name=" + name + ", border=" + border + ", area=" + area + ", pi=" + pi + "]";
	}
	
	
	
}

class Ractangle2{
	String name;
	int border,area;

	public Ractangle2(int x, int y) {
		name = "직사각형";
		border = (x + y)*2;
		area = x * y;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBorder(int border) {
		this.border = border;
	}

	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Ractangle2 [name=" + name + ", border=" + border + ", area=" + area + "]";
	}
	
	
	
}

class Tryangle2{
	String name;
	int border,area;
	
	public Tryangle2(int x, int y, int z) {
		name = "직각삼각형";
		border = x + y + z;
		area = x * y / 2;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBorder(int border) {
		this.border = border;
	}

	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Tryangle2 [name=" + name + ", border=" + border + ", area=" + area + "]";
	}
	

}

class MultiShape{
	
	LinkedHashMap<String, ArrayList<Shape2>> mms;
	String name;


	public void setMms(LinkedHashMap<String, ArrayList<Shape2>> mms) {
		this.mms = mms;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MultiPhone [mms=" + mms + ", name=" + name + "]";
	}
	
}

class MultiShape2{
	
	ArrayList<Shape2> bbs;
	String name;


	public void setBbs(ArrayList<Shape2> bbs) {
		this.bbs = bbs;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name+" : " + bbs;
	}
}

