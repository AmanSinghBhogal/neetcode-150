class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
		int fleet = 0;
		double minPrevTime = 0;
		// Descending order heap.
		PriorityQueue<Double[]> maxHeap = new PriorityQueue<>((a,b) -> Double.compare(b[0], a[0]));
		
		for(int i=0; i<position.length; i++) {
			maxHeap.add(new Double[] {(double) position[i], (double) (target-position[i])/speed[i]});
		}
		while(!maxHeap.isEmpty()) {
			if(maxHeap.peek()[1] > minPrevTime) {
				fleet++;
				minPrevTime = maxHeap.remove()[1];
			} else maxHeap.remove();
		}
		
		return fleet;
	}
}
