class Solution {

    Map<Character, List<String>> digitsToLetters = new HashMap<>();

    {
        digitsToLetters.put('2',List.of("a", "b", "c"));
        digitsToLetters.put('3',List.of("d", "e", "f"));
        digitsToLetters.put('4',List.of("g", "h", "i"));
        digitsToLetters.put('5',List.of("j", "k", "l"));
        digitsToLetters.put('6',List.of("m", "n", "o"));
        digitsToLetters.put('7',List.of("p", "q", "r", "s"));
        digitsToLetters.put('8',List.of("t", "u", "v"));
        digitsToLetters.put('9',List.of("w", "x", "y", "z"));
    }

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();

        if(digits.length()>0) {
            combinations.addAll(digitsToLetters.get(digits.charAt(0)));
        }

        for(int i=1;i<digits.length();i++) {
            char digit = digits.charAt(i);
            List<String> letters = digitsToLetters.get(digits.charAt(i));
            List<String> newCombinations = new ArrayList<>();
            for (String combination : combinations) {
                for (String letter : letters) {
                    newCombinations.add(combination+letter);
                }
            }
            combinations = newCombinations;
        }

        return combinations;
    }
}
