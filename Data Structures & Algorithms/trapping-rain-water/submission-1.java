class Solution {
    public int trap(int[] height) {
		int[] leftHighest = new int[height.length];
		int[] rightHighest = new int[height.length];
		int l = 0,r = 0;
		
		for(int i=0; i<height.length; i++) {
			l = (l> height[i]? l: height[i]);
			leftHighest[i] = l;
		} 
		
		for(int i= height.length-1; i>=0; i--) {
			r = (r> height[i]? r: height[i]);
			rightHighest[i] = r;
		}
		
		int totalArea = 0;
		
		for(int i=0;i<height.length; i++) {
			totalArea += ((Math.min(leftHighest[i], rightHighest[i]) - height[i]) < 0)? 0 : Math.min(leftHighest[i], rightHighest[i]) - height[i];
		}

		return totalArea;
    }
}
