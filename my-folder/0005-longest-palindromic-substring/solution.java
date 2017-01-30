public class Solution {
    
    int index, max;
    
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        
        for (int i=0;i<s.length();i++) {
            extend(s,i,i);
            extend(s,i,i+1);
        }
        
        return s.substring(index,index+max);
    }
    
    private void extend(String s, int low, int high) {
        while (low>=0 && high<s.length() && s.charAt(low)==s.charAt(high)) {
            low--;
            high++;
        }
        if(max< high-low-1) {
            index = low+1;
            max= high-low-1;
        }
    }
}
