class Solution {
    public int maxResult(int[] nums, int k) {
        
        int n = nums.length;
        
        int[] dp = new int[n];

        dp[0]=nums[0];

        Deque<Integer> dq = new LinkedList<>();

        dq.addLast(0);

        for(int i=1;i<n;i++) {
            //dp[i] = sum(nums[i] + max(dp[i-1]->dp[i-k])), this is the top of the dq 


            if(dq.getFirst()<i-k) {
                //keep only the indices in range to check for this particular i, i.e. i-k -> i-1
                dq.removeFirst();
            }

            int indexOfMaxPreviousDP = dq.getFirst();
            dp[i] = nums[i] + dp[indexOfMaxPreviousDP];

            int dpOfLast = dp[dq.getLast()];

            while(dpOfLast<=dp[i]) {
                //remove lower values from the monotonic decreasing deque 
                dq.removeLast();
                if(!dq.isEmpty()) {
                    dpOfLast = dp[dq.getLast()];
                } else {
                    break;
                }
            }

            //add current dp 

            dq.addLast(i);
        }

        return dp[n-1];
    }
}
