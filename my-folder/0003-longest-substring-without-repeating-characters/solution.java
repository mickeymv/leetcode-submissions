public class Solution {
    public int lengthOfLongestSubstring(String s) {
            int maxLen = 1;
        if (s == null || s.length() == 0) {
            return 0;
        } else {
            for (int i=0;i<s.length()-1;i++) {
                HashSet<Character> seen = new HashSet<Character>();
                seen.add(s.charAt(i));
                //System.out.println("\n First: "+s.charAt(i));
                int len = 1;
                for (int j=i+1;j<s.length();j++) {
                    if(!seen.contains(s.charAt(j))){
                        len++;
                        seen.add(s.charAt(j));
                        //System.out.println("\n Next: "+s.charAt(j));
                    } else {
                        j=s.length();
                        break;
                    }
                    maxLen = Math.max(maxLen,len);
                }
            
            }
        }
        return maxLen;
    }
}
