public class Solution {
    public int removeDuplicates(int[] nums) {
        int newLength = 0, index = 0;
        HashSet<Integer> ints = new HashSet<Integer>();
        if (nums.length == 0) {
            return 0;
        }
        for (int i =0;i<nums.length;i++) {
            if(ints.contains(nums[i])) {
                continue;
            } else {
                newLength++;
                ints.add(nums[i]);
                nums[index++] = nums[i];
            }
        }
        return newLength;
    }
}
