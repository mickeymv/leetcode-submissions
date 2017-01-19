public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        int[] countsR = new int[26];
        int[] countsM = new int[26];
        for(char c:ransomNote.toCharArray()){
            countsR[c-'a']++;
        }
        for(char c: magazine.toCharArray()){
            countsM[c-'a']++;
        }
        for(int i=0;i<26;i++) {
            if(countsR[i] > countsM[i]){
                return false;
            }
        }
        return true;
    }
}
