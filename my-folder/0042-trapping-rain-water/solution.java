class Solution {
    public int trap(int[] heights) {
        int[] maxHeightToTheLeft = new int[heights.length];
        int[] maxHeightToTheRight = new int[heights.length];

        int n = heights.length;

        maxHeightToTheLeft[0] = 0;
        maxHeightToTheRight[heights.length-1]=0;

        for(int i=1;i<n;i++) {
            maxHeightToTheLeft[i]=Math.max(maxHeightToTheLeft[i-1], heights[i-1]);
        }

        for(int i=n-2;i>=0;i--) {
            maxHeightToTheRight[i]=Math.max(maxHeightToTheRight[i+1], heights[i+1]);
        }


        int totalTrappedWater = 0;

        for(int i=1;i<n-1;i++) {
            int usableHeight = Math.min(maxHeightToTheRight[i], maxHeightToTheLeft[i]);

            int trappedWater = usableHeight-heights[i];

            if(trappedWater>0) {
                totalTrappedWater+=trappedWater;
            }
        }

        return totalTrappedWater;
    }
}
