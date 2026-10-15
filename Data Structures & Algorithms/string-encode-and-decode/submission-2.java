class Solution {

    public String encode(List<String> strs) {
    	
    		if(strs.size() == 0) return Character.toString((char) 258);
    		char seperator = (char) 257;
    		StringBuilder sb = new StringBuilder();
        
    		for(String s: strs)
    			sb.append(s).append(seperator);
    		
    		sb.deleteCharAt(sb.length() -1);
    		return sb.toString();
    }

    public List<String> decode(String str) {
    	
    		if(str.equals(Character.toString((char)258))) return new ArrayList();

    		char seperator = (char) 257;
    		List<String> result = Arrays.asList(str.split(Character.toString(seperator),-1));
    		return result;
    }
}
