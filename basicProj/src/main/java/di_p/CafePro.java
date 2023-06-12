package di_p;

public class CafePro {
	
	int menu;
	int cnt;
	int pirce;
	

	public void setMenu(int menu) {
		this.menu = menu;
	}


	public void setCnt(int cnt) {
		this.cnt = cnt;
	}


	public void setPirce(int pirce) {
		this.pirce = pirce;
	}


	@Override
	public String toString() {
		this.pirce = menu * cnt;
		return "[menu=" + menu + ", cnt=" + cnt + ", pirce=" + pirce + "]";
	}





	

}
