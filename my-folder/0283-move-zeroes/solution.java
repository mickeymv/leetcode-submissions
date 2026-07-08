class Solution {
    public void moveZeroes(int[] nums) {
        int indexOfZero = -1;

        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0){
                indexOfZero=i;
                break;
            }
        }

        if(indexOfZero==-1) {
            //no zeroes in the array 
            return;
        }

        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0 && indexOfZero<i) {
                nums[indexOfZero]=nums[i];
                nums[i]=0;
                while(nums[indexOfZero]!=0) {
                    indexOfZero++;
                }
            }
        }
    }
}
