class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
		int fleet = 0;
		double minPrevTime = 0;
		// List of List... [Position, timeToDestination]
		double[][] pair = new double[position.length][2];
		for(int i=0;i<position.length; i++) {
			pair[i][0] = position[i];
			pair[i][1] = (double)(target-position[i])/speed[i];
		}
		Arrays.sort(pair, (a,b) -> Integer.compare((int)a[0],(int)b[0]));
		for(int j=position.length-1; j>=0; j--) {
			if(pair[j][1] > minPrevTime) {
				fleet++;
				minPrevTime = pair[j][1];
			}
		}
		return fleet;
	}
}
