package di_p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ExamData {

	List<Integer>ban;
	List<String> names;
	List<List<Integer>>jums;
	TreeMap<Integer, List<Stud>>maps;
	
	public void setBan(List<Integer> ban) {
		this.ban = ban;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public void setJums(List<List<Integer>> jums) {
		this.jums = jums;
	}
	void calc() {
		maps = new TreeMap<>();
		for (int i = 0; i < ban.size(); i++) {
			Stud st = new Stud(ban.get(i),names.get(i), jums.get(i));
			List buf;
			if(maps.containsKey(st.ban)) {
				buf = maps.get(st.ban);
			}else {
				buf = new ArrayList<Stud>();
			}
			buf.add(st);
			maps.put(st.ban, buf);
		}
	}
	
	@Override
	public String toString() {
		String ttt = "";
		for (Map.Entry<Integer, List<Stud>> me: maps.entrySet()) {
			ttt+=me.getKey()+"반 >>>\n";
			for (Stud st : me.getValue()) {
				ttt+=st+"\n";
			}
		}
		return ttt;
	}
}

class Stud{
	int ban, tot, avg;
	
	List<Integer>jum;
	String name,id;
	
	public Stud() {
		System.out.println("기본생성자");
		// TODO Auto-generated constructor stub
	}
	
	public Stud(int ban, String name, List<Integer> jum) {
		super();
		this.ban = ban;
		this.name = name;
		this.jum = jum;
		calc();
	}
	
	
	
	public void setBan(int ban) {
		this.ban = ban;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setJum(List<Integer> jum) {
		
		
		this.jum = jum;
	}

	public void setName(String name) {
		this.name = name;
	}

	void calc() {
		tot = 0;
		for (Integer i : jum) {
			tot += i;
		}
		avg = tot / jum.size();
	}

	@Override
	public String toString() {
		return "Stud [ban=" + ban + ", id=" + id + ", name=" + name + ", jum=" + jum + ", tot=" + tot + ", avg=" + avg
				+ "]";
	}
	
	
	
	
}
