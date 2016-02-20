public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        HashMap<String, String> patternToWord = new HashMap<String, String>();
        HashMap<String, String> wordToPattern = new HashMap<String, String>();
        if(pattern.length()!= words.length){
            return false;
        }
        for(int i=0;i<words.length;i++){
            if(wordToPattern.get(words[i]) != null && !wordToPattern.get(words[i]).equals(String.valueOf(pattern.charAt(i)))) {
                return false;
            }
            if(patternToWord.get((String.valueOf(pattern.charAt(i))))==null){
                patternToWord.put(String.valueOf(pattern.charAt(i)),words[i]);
                wordToPattern.put(words[i],String.valueOf(pattern.charAt(i)));
            } else if (!words[i].equals(patternToWord.get(String.valueOf(pattern.charAt(i))))) {
                return false;
            }
        }
        return true;
    }
}
