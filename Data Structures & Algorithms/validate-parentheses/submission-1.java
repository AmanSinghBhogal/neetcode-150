class Solution {
    public boolean isValid(String s) {
		Stack<Character> st = new Stack<Character>();
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i) == '[' || s.charAt(i) == '(' ||s.charAt(i) == '{') st.push(s.charAt(i));
			else if(st.isEmpty()) return false;
			else {
				char c = st.pop();
				if(c == '(' && s.charAt(i) != ')') return false;
				if(c == '{' && s.charAt(i) != '}') return false;
				if(c == '[' && s.charAt(i) != ']') return false;
			}
		}
        return st.isEmpty();
    }
}
