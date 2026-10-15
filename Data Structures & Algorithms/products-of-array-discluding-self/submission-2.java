class Solution {
    public int[] productExceptSelf(int[] nums) {
		
		int[] leftProd = new int[nums.length];
		int[] rightProd = new int[nums.length];
		int left = 1,right = 1, j = nums.length-1;
		for(int i=0; i<nums.length; i++) {
			leftProd[i] = left;
			rightProd[j] = right;
			left = left * nums[i];
			right = right * nums[j--];
		}
		
		int [] result = new int [nums.length];
		for(int i=0;i<nums.length;i++) result[i] = leftProd[i] * rightProd[i];
        
		return result;
    }
}  
