class Solution {
    public int characterReplacement(String s, int k) {
		int maxi = 0, l=0, majorChar =0;
		HashMap<Character, Integer> ind = new HashMap<>();
		for(int r=0;r<s.length(); r++) {
			ind.put(s.charAt(r), ind.getOrDefault(s.charAt(r), 0)+1);
			majorChar = Math.max(majorChar, ind.get(s.charAt(r)));
			while((r-l+1)-majorChar > k) {
                ind.put(s.charAt(l), ind.get(s.charAt(l))-1);
				l++;
			}
			maxi = Math.max(maxi, r-l+1);
		}
        return maxi;
    }
}
