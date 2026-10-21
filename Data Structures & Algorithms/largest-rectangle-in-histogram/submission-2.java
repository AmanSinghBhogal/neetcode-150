class Solution {
    public int largestRectangleArea(int[] heights) {
		Stack<Integer[]> st = new Stack<>();
		int maxi = 0,r=0;
		for(r=0; r<heights.length; r++) {
			int updatedIndex = r;
			while(!st.isEmpty() && heights[r] < st.peek()[0]) {
				maxi = Math.max(maxi, (r-st.peek()[1])*st.peek()[0]);
				updatedIndex = st.pop()[1];
			} 
			st.push(new Integer[] {heights[r],updatedIndex});
		}
		while(!st.isEmpty()) {
			maxi = Math.max(maxi, (r-st.peek()[1])*st.pop()[0]);
		}
        return maxi;
    }
}
