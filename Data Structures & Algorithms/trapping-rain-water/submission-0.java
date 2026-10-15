class Solution {
    public int trap(int[] height) {
        int n = height.length;
		int[] leftHighest = new int[n];
		int[] rightHighest = new int[n];
		int l = 0;
		int r = 0;
		
		for(int i=0; i<n; i++) {
			l = (l> height[i]? l: height[i]);
			leftHighest[i] = l;
		} 
		
		for(int i= n-1; i>=0; i--) {
			r = (r> height[i]? r: height[i]);
			rightHighest[i] = r;
		}
		
		int totalArea = 0;
		
		int area;
		
		for(int i=0;i<n; i++) {
			area = Math.min(leftHighest[i], rightHighest[i]) - height[i];
			if(area <=0) {
				area = 0;
			}
			totalArea = totalArea+ area;
		}

		return totalArea;
    }
}
