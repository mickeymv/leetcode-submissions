public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length <= 1) {
            return false;
        }
        HashSet<Integer> map = new HashSet<Integer>();
        
        for(int n:nums){
        if(map.contains(n)){
            return true;
            
        } else{
            map.add(n);
        }
    }
    return false;
}
}
