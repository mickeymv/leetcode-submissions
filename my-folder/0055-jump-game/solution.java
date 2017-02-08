public class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        
        if (nums.length == 1) return true;
        
        int maxJump = nums[0];

        for(int i=1;i<nums.length && maxJump-->0;i++) {
            if(i == nums.length-1) {
                return true;
            }
            maxJump = Math.max(maxJump,nums[i]);
        }
    
        return false;
    }
}
