class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ind = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			int diff = target - nums[i];
			if (ind.containsKey(diff)) return new int[] {ind.get(diff), i};
			ind.put(nums[i], i);
		}
        
		return null;
    }
}
