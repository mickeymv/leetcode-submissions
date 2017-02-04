public class Solution {
    
    HashMap<Character,Integer> values = new HashMap<>();
    
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        
        int startingIndex = 0, endIndex;
        
        char[] chars = str.toCharArray();
        
        int r=0;
        
        for (int i=0;i<str.length();i++) {
            if(chars[i] == ' ' || chars[i] == ' ' || chars[i] == 0) startingIndex++;
            else break;
        }
        
        endIndex=startingIndex+1;
        
        for (int i=startingIndex+1;i<str.length();i++) {
            if(Character.isDigit(chars[i])) endIndex++;
            else break;
        }
        
        String intString = str.substring(startingIndex,endIndex);
        
        try {
        r = Integer.parseInt(intString);
        } catch (NumberFormatException e) {
            if (intString.length()==1) {
                return 0;
            } else if (intString.charAt(0) == '+' || Character.isDigit(chars[startingIndex])) {
                return Integer.MAX_VALUE;
            } else if  (intString.charAt(0) == '-') {
                return Integer.MIN_VALUE;
            }
            return 0;
        }
        return r;
        
    }
}
