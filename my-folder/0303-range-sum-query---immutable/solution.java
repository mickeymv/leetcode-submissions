import java.util.*;

public class NumArray {

    ArrayList<Integer> sums = new ArrayList<Integer>();
    public NumArray(int[] nums) {
        int size=nums.length;
        if (size>0) {
        sums.add(0,nums[0]);
        for(int i=1;i<size;i++) {
            sums.add(i,sums.get(i-1)+nums[i]);
        }
    }}

    public int sumRange(int i, int j) {
        if(i==0) return sums.get(j);
        else 
        return sums.get(j)-sums.get(i-1);
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);
