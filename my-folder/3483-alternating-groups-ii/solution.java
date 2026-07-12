class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int left=0, right=1;

        int totalColorsToLookAt = n+k-1;

        int numberOfAlternatingGroups=0;

        while(right<totalColorsToLookAt) {
            if (colors[right%n]!=colors[(right-1)%n]) {
                //alternating
                if(right-left+1 == k) { //if window size is k
                    numberOfAlternatingGroups++;
                    left++;
                }
                right++;
            } else {
                //not alternating, increment window to get rid of the 
                //non-alternating tiles 
                left = right;
                right++;
            }
        }

        return numberOfAlternatingGroups;
    }
}
