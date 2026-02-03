class Solution {
    public int maxProfit(int[] prices) {
        // giving the first element to min variable  ... 
        int min = prices[0];
        // initializing the profit with the 0
        int max_profit = 0;
        // traversing a LOOP for prices[]
        for(int i =0 ; i< prices.length ; i++ ){
            // if the value of the other elements is less than the first element of the 
            // array , so we will change the value with the samllest element
            if(prices[i] < min){
                min = prices[i];
            }
            // when the value of the curr. element is more than that of the minimum element
            // we will campare the max from the both one is profit and other is current profit
            else{
                max_profit = Math.max(max_profit , prices[i]-min);
            }
        }
          return max_profit;
    }
}
