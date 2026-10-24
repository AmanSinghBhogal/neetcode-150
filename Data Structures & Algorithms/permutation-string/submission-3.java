class Solution {
    public boolean checkInclusion(String s1, String s2) {
		if(s1.length()> s2.length()) return false;
		HashMap<Character, Integer> needMap = new HashMap<>(), haveMap = new HashMap<>();
		for(int i=0; i<s1.length(); i++) {
			needMap.put(s1.charAt(i), needMap.getOrDefault(s1.charAt(i), 0) +1);
		}
		for(int r=0;r<s2.length(); r++) {
			if(needMap.containsKey(s2.charAt(r))) {
				haveMap.put(s2.charAt(r), haveMap.getOrDefault(s2.charAt(r), 0)+1);
			}
			if(r>=s1.length() && needMap.containsKey(s2.charAt(r-s1.length()))) {
				haveMap.put(s2.charAt(r-s1.length()), haveMap.getOrDefault(s2.charAt(r-s1.length()), 1)-1);
			}
			if(haveMap.equals(needMap)) return true;
		}
        return false;
    }
}
