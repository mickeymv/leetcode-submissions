class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        /**
        The main idea for this is I think a sliding window of size 3.
        We need to ensure that the first and second color is different, 
        but the first and last color is the same, to get an alternating group.

        The other idea is to have the group's first index run from
        i=0->n-1
        but the groups last index is (i+2)%n (to get the circle effect)
         */

         int numberOfAlternatingGroups = 0;
         int n = colors.length;

         for(int i=0;i<n;i++) {
            if(colors[i]!=colors[(i+1)%n] && colors[i]==colors[(i+2)%n]) {
                numberOfAlternatingGroups++;
            }
         }

         return numberOfAlternatingGroups;
    }
}
