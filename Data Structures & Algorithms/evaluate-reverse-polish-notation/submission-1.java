class Solution {
    private int performOp(int b, int a, String o) {
		if(Character.toString('-').equals(o)) return a-b;
		if(Character.toString('+').equals(o)) return a+b;
		if(Character.toString('*').equals(o)) return a*b;
		if(Character.toString('/').equals(o)) return a/b;
		return 0;
	}
	
	public int evalRPN(String[] tokens) {
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0; i<tokens.length; i++) {
			if(!Character.toString('+').equals(tokens[i]) && !Character.toString('-').equals(tokens[i]) && !Character.toString('*').equals(tokens[i]) && !Character.toString('/').equals(tokens[i])) {
				st.push(Integer.valueOf(tokens[i]));
			} else {
				st.push(performOp(st.pop(),st.pop(),tokens[i]));
			}
		}
        return st.pop();
    }
}
