package di_p;

import java.util.ArrayList;

public class ComModule {
	
	String kind,name;

	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ComModule [kind=" + kind + ", name=" + name + "]";
	}
}

class MainBoard extends ComModule{
	
	
}

class KeyBoard extends ComModule{
	

}

class Mouse extends ComModule{
	
	
}

class Moniter extends ComModule{
	
}

class Computer{
	
	String name;
	ArrayList moudle;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMoudle(ArrayList moudle) {
		this.moudle = moudle;
	}
	@Override
	public String toString() {
		return "Computer [name=" + name + ", moudle=" + moudle + "]";
	}
	



	

}
