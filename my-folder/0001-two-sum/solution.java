class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indicesToSumToTarget = new int[2];
                
        for (int i = 0; i< nums.length ; i++) {
            for (int j= 0 ; j < nums.length && j != i ; j++ ) {
                if (nums[i] + nums[j] == target) {
                    indicesToSumToTarget[0] = i;
                    indicesToSumToTarget[1] = j;
                    return indicesToSumToTarget;
                }
            }
        }
        
        return indicesToSumToTarget;
    }
}
