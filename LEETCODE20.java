class Solution {
    // function for maximum profit
    public int maxProfit(int[] prices) {
        // initializing profit variable
        int profit = 0;
        // loop to traverse whole array
        for(int i = 1 ;i < prices.length ; i++){
            // if the price of current is less than the prev.so we will move to next
            // if the prices of the current is greater than the prev. .. 
            // so we will minus the current from prev to get profit 
            if(prices[i] > prices[i-1]){
                // loop works again and again , and profit gets added again and again
                profit += (prices[i] - prices[i-1]);
            }
        }
        // return the max 
        return profit;
    }
}
