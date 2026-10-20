class Solution {
    public int maxProfit(int[] prices) {
		int maxProfit = 0, maxi=Integer.MIN_VALUE;
		for(int i=prices.length-1; i>=0; i--) {
			maxi = Math.max(maxi, prices[i]);
			maxProfit = Math.max(maxProfit, maxi-prices[i]);
		}
		return maxProfit;
    }
}
