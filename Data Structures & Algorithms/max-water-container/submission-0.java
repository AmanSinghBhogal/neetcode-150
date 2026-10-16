class Solution {
    public int maxArea(int[] heights) {
		int maxi = Integer.MIN_VALUE;
		int i=0, j=heights.length-1;
		while(i<j) {
			int area = (j-i) * Math.min(heights[i], heights[j]);
			if(heights[i] < heights[j]) i++;
			else j--;
			maxi = Math.max(maxi, area);
		}
        return maxi;
    }
}
