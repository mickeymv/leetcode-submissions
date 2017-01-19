public class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0,j=0;
        if(nums.length == 0) {
            return 0;
        }
        for(j=0;j<nums.length;j++){
            if(nums[j] == val) {
                continue;
            } else {
                nums[index++]=nums[j];
            }
        }
        return index;
    }
}
