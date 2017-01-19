public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder("");
        if(strs.length == 0){
            return "";
        }
        for(int col=0;col<strs[0].length();col++){
            char ch = strs[0].charAt(col);
            int row =0;
            for( row=0;row<strs.length;row++){
                if(col>= strs[row].length() || strs[row].charAt(col) != ch){
                  break;  
                } 
            }
            if(row<strs.length) {
                break;
            } else {
                str.append(ch);
            }
        }
        return str.toString();
    }
}
