package di_p;

import java.util.ArrayList;
import java.util.Arrays;

public class Stu {
	
	String name = "";
	int [] jum;
	int tot,avg;
	
	
	public Stu(String name, int[] jum) {
		this.name = name;
		this.jum = jum;
		calc();
	}
	
	void calc() {
		
		for (int j : jum) {
			this.tot += j;
		}
		this.avg = tot/jum.length;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", jum=" + Arrays.toString(jum) + ", tot=" + tot + ", avg=" + avg + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setJum(int[] jum) {
		this.jum = jum;
	}
	
}

class Ban{
	
	ArrayList<Stu> studs;

	public Ban(ArrayList<Stu> studs) {
		this.studs = studs;
	}

	public void setStuds(ArrayList<Stu> studs) {
		this.studs = studs;
	}
	
}