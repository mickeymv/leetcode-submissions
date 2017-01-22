public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0],nums[1]);
        } 
        int[] maxLoot = new int[nums.length];
        
        for(int i=0;i<nums.length;i++) {
            maxLoot[i] = Math.max(nums[i]+maxI(i-2,nums,maxLoot),maxI(i-1,nums,maxLoot));
        }
        
        return maxLoot[nums.length-1];
    }
    
    private int maxI(int index, int[] nums, int[] maxLoot) {
        if(index<0) {
            return 0;
        } else return maxLoot[index];
    }
}
