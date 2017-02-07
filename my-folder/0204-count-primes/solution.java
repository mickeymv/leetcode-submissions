public class Solution {
    
    List<Integer> primeList = new ArrayList<>(); 
    
    public int countPrimes(int n) {
        if (n<2) return 0;
        
        boolean[] nP = new boolean[n];
        
        int count = 0;
        
        for(int i=2;i<n;i++) {
            if(!nP[i]) {
                count++;
                for(int j=2;i*j<n;j++) {
                    nP[i*j] = true;
                }
            }
        }
        
        return count;
    }
}
