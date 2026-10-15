class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> index = new HashMap<>();
		for(int i:nums) {
			if(index.containsKey(i)) {
				return true;
			}
			index.put(i,1);
		}
		return false;
    }
}