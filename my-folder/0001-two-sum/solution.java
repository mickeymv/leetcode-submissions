public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoIndices = new int[2];
        if(nums.length < 3) {
            twoIndices[0]=0;
            twoIndices[1]=1;
            return twoIndices;
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++) {
            int rem = target - nums[i];
            if(map.containsKey(rem)) {
                twoIndices[0]=map.get(rem);
                twoIndices[1]=i;
                return twoIndices;
            } else {
                map.put(nums[i],i);
            }
        }
        
        return twoIndices;
    }
}
