public class Solution {
    public int maxProfit(int[] prices) {
        
        if (prices == null || prices.length < 2) return 0; 
        
        int maxProfit = 0;
        
        int buyLow=prices[0];
        
        for(int i=1;i<prices.length;i++) {
            if(prices[i]<buyLow) {
                buyLow = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i]-buyLow);
            }
        }
        
        return maxProfit;
    }
}
