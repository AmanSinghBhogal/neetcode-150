class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       int[] result = new int[temperatures.length];
       Stack<List<Integer>> sk = new Stack<List<Integer>>();
       // We will be pushing temperature with their index.
       for(int i=0; i<temperatures.length; i++) {
    	   		while(!sk.isEmpty() && temperatures[i] > sk.peek().get(0)) result[sk.peek().get(1)] = i - sk.pop().get(1);
    	   		sk.push(Arrays.asList(temperatures[i], i));
       }
	   return result;
    }
}
