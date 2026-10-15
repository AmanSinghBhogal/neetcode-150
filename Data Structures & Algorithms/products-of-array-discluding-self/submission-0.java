class Solution {
    public int[] productExceptSelf(int[] nums) {
		
		int n = nums.length;
		int[] leftProd = new int[n];
		int[] rightProd = new int[n];
		int left = 1;
		int right = 1;
		int j = n-1;
		for(int i=0; i<n; i++) {
			leftProd[i] = left;
			rightProd[j] = right;
			left = left * nums[i];
			right = right * nums[j--];
		}
		
		int [] result = new int [n];
		for(int i=0;i<n;i++) result[i] = leftProd[i] * rightProd[i];
        
		return result;
    }
}  
