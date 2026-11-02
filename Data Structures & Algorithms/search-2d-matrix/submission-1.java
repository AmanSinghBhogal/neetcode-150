class Solution {
   public boolean search(int[] nums, int target) {
		int low = 0, high = nums.length-1;
		do {
			int mid = (low+high)/2;
			if(nums[mid] == target) return true;
			else if(nums[mid] < target) low = mid + 1;
			else if(nums[mid] > target) high = mid - 1;
		} while(low <= high);
		return false;
	}

	public boolean searchMatrix(int[][] matrix, int target) {
		
		int low = 0, high = matrix.length-1;
		do {
			int mid = (low + high) /2;
			if(matrix[mid][0] <= target && matrix[mid][matrix[mid].length - 1] >= target) return search(matrix[mid], target);
			else if(matrix[mid][0] <= target) low = mid+1;
			else if(matrix[mid][matrix[mid].length - 1] >= target) high = mid - 1;
		} while(low <= high);
		
        return false;
    }
}
