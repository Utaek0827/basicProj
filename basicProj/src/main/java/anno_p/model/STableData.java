package anno_p.model;

import jakarta.annotation.Resource;

public class STableData {
	
	String name;
	
	@Resource(name = "su1")
	Sul sul;
	
	@Resource(name = "an1")
	Anju anju;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "STableData [name=" + name + ", sul=" + sul + ", anju=" + anju + "]";
	}
}

class STableData2 {
	
	String name;
	
	@Resource(name = "su2")
	Sul sul;
	
	@Resource(name = "an2")
	Anju anju;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "STableData [name=" + name + ", sul=" + sul + ", anju=" + anju + "]";
	}
}

class STableData3 {
	
	String name;
	
	@Resource(name = "su3")
	Sul sul;
	
	@Resource(name = "an3")
	Anju anju;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "STableData [name=" + name + ", sul=" + sul + ", anju=" + anju + "]";
	}
}

class STableData4 {
	
	String name;
	
	@Resource(name = "su4")
	Sul sul;
	
	@Resource(name = "an4")
	Anju anju;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "STableData [name=" + name + ", sul=" + sul + ", anju=" + anju + "]";
	}
}

class Sul{
	
	String name;

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "[name=" + name + "]";
	}
}

class Anju{
	
	String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[name=" + name + "]";
	}
}