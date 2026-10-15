class Solution {
    public boolean isPalindrome(String s) {
		int i=0, j=s.length()-1;
		while(i<j) {
            if(!(s.charAt(i)>='A' && s.charAt(i)<='z') && !(s.charAt(i)>='0' && s.charAt(i)<='9')) {
                i++;
                continue;
            }
            if(!(s.charAt(j)>='A' && s.charAt(j)<='z') && !(s.charAt(j)>='0' && s.charAt(j)<='9')){ 
                j--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) return false;
        }
		return true;  
    }
}
