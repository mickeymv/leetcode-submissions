public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null) return -1;

        int startIndexOfNeedleInHaystack = -1;
        
        int legthOfNeedle = needle.length();
        
        if(needle.equals("")) return 0;
        
        for(int i=0;i<haystack.length();i++) {
            if(haystack.charAt(i) == needle.charAt(0) && i+legthOfNeedle <= haystack.length()) {
                boolean contains =  haystack.substring(i,i+legthOfNeedle).equals(needle);
                if(contains) {
                    return i;
                }
            }
        }
return startIndexOfNeedleInHaystack;
        //return haystack.indexOf(needle);
    }
}
