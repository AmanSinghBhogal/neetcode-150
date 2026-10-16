class Solution {
    public int trap(int[] height) {
		int[] leftMax = new int[height.length];
		int[] rightMax = new int[height.length];
		int result = 0, left=0, right = height.length-1, lm=-1, rm=-1;
		for(left=0;left<height.length; left++) {
			lm = Math.max(lm, height[left]);
			leftMax[left] = lm;
			rm = Math.max(rm, height[right]);
			rightMax[right--] = rm;
		}
		for(int i=0; i<height.length; i++) {
			result += (Math.min(leftMax[i], rightMax[i])-height[i]);
		}
		
		return result;
    }
}
