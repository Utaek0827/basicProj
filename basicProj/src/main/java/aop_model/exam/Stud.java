package aop_model.exam;

import java.util.Arrays;

public class Stud{
	
	String name,kind;
	int [] jum;
	int avg,tot;
	
	public int getAvg() {
		return avg;
	}

	public int[] getJum() {
		return jum;
	}

	public void setJum(int[] jum) {
		this.jum = jum;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public Stud(String name, int[] jum) {
		this.name = name;
		this.jum = jum;
		calc();
	}
	
	void calc() {
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}


	@Override
	public String toString() {
		return "Stud [name=" + name + ", kind=" + kind + ", jum=" + Arrays.toString(jum) + ", avg=" + avg + ", tot="
				+ tot + "]";
	}
}