package anno_p.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	String name;
	
	Engine en;
	List<Wheel> whs;
	Window Window;
	Handle handle;
	Sheet sheet;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Autowired
	public void setEn(Engine en) {
		this.en = en;
	}
	
	@Autowired()
	public void setWhs(List<Wheel> whs) {
		this.whs = whs;
	}
	
	@Autowired
	public void setWindow(Window window) {
		Window = window;
	}
	
	@Autowired(required = false)
	public void setHandle(Handle handle) {
		this.handle = handle;
	}
	
	@Autowired
	@Qualifier("sh1")
	public void setSheet(Sheet sheet) {
		this.sheet = sheet;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", en=" + en + ", whs=" + whs + ", Window=" + Window + ", handle=" + handle
				+ ", sheet=" + sheet + "]";
	}
}


class Bike{
	
	String name;
	Engine en;
	Wheel whs;
	Handle handle;
	Sheet sheet;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Autowired
	public void setEn(Engine en) {
		this.en = en;
	}
	
	@Autowired(required = false)
	@Qualifier("wh1")
	public void setWhs(Wheel whs) {
		this.whs = whs;
	}
	
	@Autowired(required = false)
	public void setHandle(Handle handle) {
		this.handle = handle;
	}
	
	@Autowired
	public void setSheet(Sheet sheet) {
		this.sheet = sheet;
	}
	
	@Override
	public String toString() {
		return "Bike [name=" + name + ", en=" + en + ", whs=" + whs + ", handle=" + handle + ", sheet=" + sheet + "]";
	}
	
	

	
	
}


class Engine{
	
	String name;
	String power;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPower(String power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Engine [name=" + name + ", power=" + power + "]";
	}
	
}

class Wheel{
	
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
		return "Wheel [name=" + name + ", size=" + size + "]";
	}
	
	
	
}

class Window{
	
	String kind;
	int size;
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Window [kind=" + kind + ", size=" + size + "]";
	}	
}

class Handle{
	
	int size;

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Handle [size=" + size + "]";
	}
	
}

class Sheet{
	
	String kind;

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Sheet [kind=" + kind + "]";
	}
}


