class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);

        //^sort the arrays according to start time

        int[] interval1 = intervals[0];

        List<int[]> nonOverlappingIntervals = new ArrayList<>();

        for(int i=1;i<intervals.length;i++) {
            int[] interval2 = intervals[i];
            if(interval1[1]>=interval2[0]) {
                //we need to merge
                interval1[1] = Math.max(interval1[1],interval2[1]);
            } else {
                //no overlap, we can add to list 
                nonOverlappingIntervals.add(interval1);
                interval1=interval2;
            }
        }

        nonOverlappingIntervals.add(interval1);

        return nonOverlappingIntervals.toArray(new int[nonOverlappingIntervals.size()][]);
    }
}
