public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int head = 0, tail = numbers.length-1;
        
        while(head<tail) {
            int sum = numbers[head]+numbers[tail];
            if(sum == target) {
                return new int[]{head+1, tail+1};
            } 
            if(sum>target) {
                tail--;
            } else {
                head++;
            }
            
        }
        
        return new int[]{};
    }
}
