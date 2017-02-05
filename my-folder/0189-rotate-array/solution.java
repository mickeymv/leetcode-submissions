public class Solution {
    public void rotate(int[] nums, int k) {
        if(k==0 || nums == null || nums.length < 2) return;
        HashMap<Integer,Integer> map = new HashMap<>();
        int l =nums.length;
        for(int i=0;i<nums.length;i++) {
            map.put((i+k)%l,nums[i]);
        }
        for(int i=0;i<nums.length;i++) {
            nums[i]=map.get(i);
        }
        
    }
}
