class Solution {
    public int search(int[] nums, int target) {
		int high = nums.length - 1, low = 0;
		while(low <= high) {
			if(nums[(high+low)/2] == target) return (high+low)/2;
			else if(nums[(high+low)/2] < target) low = ((high+low)/2) +1;
			else if(nums[(high+low)/2] > target) high = ((high+low)/2)-1;
		}
        return -1;
    }
}
