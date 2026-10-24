class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
		int[] ans = new int[nums.length-k+1];
		Deque<Integer[]> deq = new ArrayDeque<>();
		for(int i=0;i<k;i++) {
			while(!deq.isEmpty() && deq.peekLast()[0]<nums[i]) {
				deq.removeLast();
			}
			deq.addLast(new Integer[] {nums[i],i});
		}
		ans[0] = deq.getFirst()[0];
		int j=1;
		for(int r=k; r<nums.length; r++) {
			while(!deq.isEmpty() && deq.peekLast()[0]<nums[r]) {
				deq.removeLast();
			}
			while(!deq.isEmpty() && deq.peekFirst()[1] <= r-k) {
				deq.removeFirst();
			}
			deq.addLast(new Integer[] {nums[r],r});
			ans[j++] = deq.getFirst()[0];
		}
        return ans;
    }
}
