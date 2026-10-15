class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ind = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			if (ind.containsKey(target - nums[i])) return new int[] {ind.get(target - nums[i]), i};
			ind.put(nums[i], i);
		}
        
		return null;
    }
}
