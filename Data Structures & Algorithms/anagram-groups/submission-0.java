class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> ind = new HashMap<>();
        for(String s: strs) {
        	String beforeSort = s;
        	char [] arChar = s.toCharArray();
        	Arrays.sort(arChar);
        	s = new String(arChar);
        	List<String> value = ind.getOrDefault(s, new ArrayList<String>());
        	value.add(beforeSort);
        	ind.put(s, value);
        }
        List<List<String>> result = new ArrayList<>();
        ind.forEach((key,value) -> result.add(value));
        return result;
    }
}
