class Solution {
    public int[] topKFrequent(int[] nums, int k) {
	     
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i: nums)  map.put(i, map.getOrDefault(i, 0) +1);
		
		PriorityQueue<int[]> minHeap = new PriorityQueue<> ((a,b) -> Integer.compare(a[0], b[0])); 
		map.forEach((key,value) -> {
			minHeap.add(new int[] {value, key});
			if(minHeap.size()>k) minHeap.remove();
		});
		int[] result = new int[k];
		for(int i=0;i<k; i++) result[i] = minHeap.remove()[1];
		
		return result;
    }
}
