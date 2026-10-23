class Solution {
    public String minWindow(String s, String t) {
		int l = 0, r=0, have = 0, ansL=0, ansR=0, mini = Integer.MAX_VALUE;
		HashMap<Character, Integer> needMap = new HashMap<>();
		HashMap<Character, Integer> haveMap = new HashMap<>();
		for(int i=0; i<t.length(); i++) needMap.put(t.charAt(i), needMap.getOrDefault(t.charAt(i), 0)+1);
		int  need = needMap.size();
		for(r=0; r<s.length();r++) {
			if(needMap.containsKey(s.charAt(r))) {
				haveMap.put(s.charAt(r), haveMap.getOrDefault(s.charAt(r), 0) +1);
				if(haveMap.get(s.charAt(r)).equals(needMap.get(s.charAt(r)))) have++;
			}
			while(have == need) {
				if(mini > r-l+1) {
					mini = r-l+1;
					ansL = l;
					ansR = r+1;
				}
				if(haveMap.containsKey(s.charAt(l))) haveMap.put(s.charAt(l), haveMap.getOrDefault(s.charAt(l), 0) -1);
				if(haveMap.containsKey(s.charAt(l)) && haveMap.get(s.charAt(l)).compareTo(needMap.get(s.charAt(l))) <0) have--;
				l++;
			}
		}
        return s.substring(ansL, ansR);
    }
}
