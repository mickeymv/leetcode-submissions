public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] charS = s.toCharArray();
        Arrays.sort(charS);
        String sS= new String(charS);
        
        char[] charT = t.toCharArray();
        Arrays.sort(charT);
        String sT = new String(charT);
        
        return sS.equals(sT);
    }
}
