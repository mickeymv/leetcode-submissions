class Solution {
    public int countBinarySubstrings(String s) {        
        int equalNoOfOnesAndZeroes=0;


        for(int i=0;i<s.length()-1;i++) {
            int left=i, right=i+1;
            while(left>=0 && right<=s.length()-1) {
                if (s.charAt(left)!=s.charAt(right)) {
                    equalNoOfOnesAndZeroes++;
                    left--;
                    right++;
                    if(left>=0 && right<=s.length()-1) {
                        if(s.charAt(left)!=s.charAt(left+1) || s.charAt(right)!=s.charAt(right-1)) {
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
        }


        return equalNoOfOnesAndZeroes;
    }
}
