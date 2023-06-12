package di_p;

public class Shape {

	String name = "";
	int border,area;
	
	public Shape(int x) {
		Circle one = new Circle(x);
		this.name = one.name;
		this.border = one.border;
		this.area = one.area;
		
	}
	
	public Shape(int x, int y) {
		Ractangle rac = new Ractangle(x,y);
		this.name = rac.name;
		this.border = rac.border;
		this.area = rac.area;
	}
	
	public Shape(int x, int y, int z) {
		Tryangle ttt = new Tryangle(x,y,z);
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
		return "Shape [name=" + name + ", border=" + border + ", area=" + area + "]";
	}

}

class Circle{
	String name;
	int border,area;
	
	double pi = 3.14;

	public Circle(int x) {
		name = "원";
		border = (int)(pi * 2 * x);
		area = (int)(pi * pi * x);
	}
}

class Ractangle{
	String name;
	int border,area;

	public Ractangle(int x, int y) {
		name = "직사각형";
		border = (x + y)*2;
		area = x * y;
	}
}

class Tryangle{
	String name;
	int border,area;
	
	public Tryangle(int x, int y, int z) {
		name = "직각삼각형";
		border = x + y + z;
		area = x * y / 2;
	}
}