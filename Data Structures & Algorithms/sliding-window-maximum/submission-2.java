class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] output = new int[nums.length-k+1];
        Deque<Integer[]> d = new ArrayDeque<Integer[]>();
        
        // Itterate k and remove first solution.
        for(int i=0;i<k;i++) {
        		
    			while(!d.isEmpty() && d.peekLast()[0] < nums[i]) d.removeLast();
    			
    			d.addLast(new Integer[] {nums[i],i});
        }
        output[0] = d.peekFirst()[0];
        int j=1;
        for(int i=k;i<nums.length; i++) {
        		while(!d.isEmpty() && d.peekLast()[0] < nums[i]) d.removeLast();
			
			d.addLast(new Integer[] {nums[i],i});
			// Check if the maximum value belongs to current window or not:
			while(!d.isEmpty() && d.peekFirst()[1] < i-k+1) d.removeFirst();
			
			output[j++] = d.peekFirst()[0];
        }
        
		return output;
    }
}
