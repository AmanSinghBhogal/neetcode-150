class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
		 for(int i : nums) map.put(i, false);
		 int maxi = 0;
		 
		 for(int i=0; i<nums.length; i++) {
            int count = 1;
            int x = nums[i], y =nums[i];
            map.put(x, true);

            while(map.containsKey(++x) && map.get(x)!= true) {
                count++;
                map.put(x, true);
            }

            while(map.containsKey(--y) && map.get(y)!= true) {
                count++;
                map.put(y, true);
            }
            if(maxi < count) maxi = count;
		 }
		 
		 return maxi;
    }
}
