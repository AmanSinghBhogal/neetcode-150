class Solution {
    public int maxProfit(int[] prices) {
		int maxProfit = 0, maxi=Integer.MIN_VALUE;
		int [] maxLeft = new int[prices.length];
		for(int i=prices.length-1; i>=0; i--) {
			maxi = Math.max(maxi, prices[i]);
			maxLeft[i] = maxi;
		}
		for(int i=0; i<prices.length; i++) maxProfit = Math.max(maxProfit, (maxLeft[i] - prices[i]));
		return maxProfit;
    }
}
