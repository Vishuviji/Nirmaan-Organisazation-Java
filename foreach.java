package day11;

public class foreach {
	public static void main( String[] args) {
	/*	int[] nums = {11,22,33,44,55};
		int i= nums.length;
		 for(int num:nums) {
		
           System.out.println(num);
		
	}*/
		int[] nums= new int[6];
		nums[0]=11;
		nums[1]=22;
		nums[2]=33;
		nums[3]=44;
		nums[4]=55;
		nums[5]=66;
		/*for(int num:nums) {
			
	           System.out.println(num);
			
		}*/
		int total=0;
		for(int ans:nums) {
			total+=ans;
	           System.out.println(total);
			
		}
}
}