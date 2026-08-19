class Solution {
    public int maxProfit(int[] prices) {
        int max =0;
        int profit = prices[0];
        for(int i=0; i<prices.length; i++){
            if(profit > prices[i]){
                profit = prices[i];
            }
            max = Math.max(max ,prices[i]- profit);
        }
        return max;
    }
}