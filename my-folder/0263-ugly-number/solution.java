public class Solution {
    public boolean isUgly(int num) {
        if (num<2) {
            return num==1;
        } else {
            int[] ds={2,3,5};
            
            for(int d:ds) {
                while(num%d==0){
                    num/=d;
                }
            }
            return num==1;
        }
    }
}
