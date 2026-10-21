class Solution {
    public int lengthOfLongestSubstring(String s) {
		HashMap<Character,Integer> lastSeen = new HashMap<>();
		int l=0,r=0, maxi = 0;
		while(r<s.length()) {
			if(lastSeen.containsKey(s.charAt(r)) && !(lastSeen.get(s.charAt(r)) < l)) {
				maxi = Math.max(maxi, r-l);
				l = lastSeen.get(s.charAt(r)) +1;
			} 
			lastSeen.put(s.charAt(r), r);
			r++;
		}
		maxi = Math.max(maxi, r-l);
        return maxi;
    }

}
