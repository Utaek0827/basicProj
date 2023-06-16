package aop_model.exam;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class Exam {
	
	Stud st;
	
	public Stud mid(String name, int ...jum){
		st = new Stud(name, jum);
		st.kind = "중간고사";
		
		return st;
	}
	
	public Stud last(String name, int ...jum){
		st = new Stud(name, jum);
		st.kind = "기말고사";

		return st;
	}
	
	public Stud test(String name, int ...jum){
		st = new Stud(name, jum);
		st.kind = "모의고사";

		return st;
	}

	@Override
	public String toString() {
		return "Exam [st=" + st + "]";
	}
		
	
}

