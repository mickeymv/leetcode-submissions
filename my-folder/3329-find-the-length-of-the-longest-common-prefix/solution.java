class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int longestCommonPrefix=0;
        
        HashSet<Integer> prefixes = new HashSet<>();

        for(int num: arr1) {
            while(num>0) {
                prefixes.add(num);
                num/=10;
            }
        }

        for(int num : arr2) {
            while(num>0) {
                if(prefixes.contains(num)) {
                    String n = String.valueOf(num);
                    if(n.length()>longestCommonPrefix) {
                        longestCommonPrefix = n.length();
                    }
                    break;
                } else {
                    num/=10;
                }
            }
        }

        return longestCommonPrefix;
    }
}
