package di_p;

import java.util.Arrays;

public class ColData {
	
	int [] nums;
	String [] names;
	
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	public void setNames(String[] names) {
		this.names = names;
	}
	
	@Override
	public String toString() {
		return "ColData [nums=" + Arrays.toString(nums) + ", names=" + Arrays.toString(names) + "]";
	}
	
	
	

}
