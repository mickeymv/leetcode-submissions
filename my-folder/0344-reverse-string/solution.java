public class Solution {
    public String reverseString(String s) {
        if(s == null || s.length() ==1) return s;
        
        char[] sc = s.toCharArray();
        
        for(int i=0,j=s.length()-1;i<j;i++,j--) {
            char t = sc[i];
            sc[i] = sc[j];
            sc[j] = t;
        }
        
        return new String(sc);
    }
}
