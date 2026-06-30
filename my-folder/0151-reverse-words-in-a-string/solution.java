class Solution {
    public String reverseWords(String s) {
        String reversedString="";

        String[] words = s.split(" ");

        for(String word:words) {
            if(!word.isBlank()) {
                if(reversedString.length()==0) {
                    reversedString = word;
                } else {
                    reversedString = word + " " + reversedString;
                }
            }
        }

        return reversedString;
    }
}
