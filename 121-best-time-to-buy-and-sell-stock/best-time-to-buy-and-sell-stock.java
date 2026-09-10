class Solution {
    public int maxProfit(int[] prices) {
        int max_diff= 0;
        int least=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(least>prices[i])
            {
                least = prices[i];
            }
            if(prices[i]-least>max_diff)
            {
            max_diff= prices[i]-least;
            }
        }
        return max_diff;
    }
}