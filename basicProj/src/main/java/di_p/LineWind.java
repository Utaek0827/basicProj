package di_p;

import java.util.Arrays;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;

public class LineWind implements BeanNameAware, InitializingBean, DisposableBean{

	String name;
	int wing;
	
		
	public LineWind() {
		System.out.println("2. LineWind 생성자");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setName 실행");
		this.name = name;
	}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	@Override
	public String toString() {
		return "LineWind [name=" + name + ", wing=" + wing + "]";
	}
	
	@Override
	public void setBeanName(String name) {

		System.out.println("3. setBeanName():"+name+"=>"+this.name+","+wing);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("5. afterPropertiesSet():"+name+","+wing);
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("8. destroy():"+name+","+wing);
	}	
}

class PostStu implements BeanNameAware, InitializingBean, DisposableBean{

	String name, kind;
	int [] jum;
	int tot,avg;
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setJum(int[] jum) {
		this.jum = jum;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "PostStu [name=" + name + ", kind=" + kind + ", jum=" + Arrays.toString(jum) + ", tot=" + tot + ", avg="
				+ avg + "]";
	}
	
	void calc() {
		for (int i : jum) {
			this.tot += i;
		}
		this.avg = this.tot/jum.length;
		
	}
	
	
	
	
}

class PostProfessor implements BeanNameAware, InitializingBean, DisposableBean{

	String name;
	
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "PostProfessor [name=" + name + "]";
	}
	
	
}


