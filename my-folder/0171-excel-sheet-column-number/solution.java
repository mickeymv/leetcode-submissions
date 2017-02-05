public class Solution {
    public int titleToNumber(String s) {
        if (s==null || s.length() < 1) return 0;
        
        int result=0;
        
        int stringCharIndex = 0;
        
        int iteration =0;

        while(stringCharIndex<s.length()) {
            //System.out.println("Iteration= "  +iteration);
            char stringChar = s.charAt(stringCharIndex++);
            //System.out.println("stringChar= " +stringChar);
            int charValue = (int) stringChar - 'A' + 1;
            //System.out.println("charValue= " +charValue);
            //System.out.println("colNumber= " +colNumber);
            //System.out.println("Math.pow(26,iteration)*charValue= " +(Math.pow(26,iteration)*charValue));
            result = result*26+charValue;
            //System.out.println("colNumber= " +colNumber);
        }
        
        return result;
    }
}
