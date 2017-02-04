public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        
        int uniqueElements = 1;
        
        int lastNumber = nums[0];
        
        for(int i=1;i<nums.length;i++) {
            if(nums[i]!=lastNumber) {
                lastNumber = nums[i];
                nums[uniqueElements++] = lastNumber;
            } 
        }
        return uniqueElements;
    }
}
