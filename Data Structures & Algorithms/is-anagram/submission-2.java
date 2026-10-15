class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
		HashMap<Character, Integer> s1 = new HashMap();
		HashMap<Character, Integer> s2 = new HashMap();
		for(int i=0; i<s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			if(s1.containsKey(c1)) {
				int value = s1.get(c1) + 1;
				s1.put(c1, value);
			} else s1.put(c1, 1);
			if(s2.containsKey(c2)) {
				int value = s2.get(c2) + 1;
				s2.put(c2, value);
			} else s2.put(c2, 1);
		}
		
		return s1.equals(s2);
    }
}
