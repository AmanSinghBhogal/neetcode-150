class Solution {
    public int largestRectangleArea(int[] heights) {
		Stack<Integer[]> st = new Stack<>();
		int maxi = 0,r=0;
		for(r=0; r<heights.length; r++) {
			if(heights[r] > maxi) maxi = heights[r];
			int updatedIndex = r;
			while(!st.isEmpty() && heights[r] < st.peek()[0]) {
				Integer[] arr = st.pop();
				maxi = Math.max(maxi, (r-arr[1])*arr[0]);
				updatedIndex = arr[1];
			} 
			st.push(new Integer[] {heights[r],updatedIndex});
		}
		while(!st.isEmpty()) {
			Integer arr[] = st.pop();
			maxi = Math.max(maxi, (r-arr[1])*arr[0]);
		}
        return maxi;
    }
}
