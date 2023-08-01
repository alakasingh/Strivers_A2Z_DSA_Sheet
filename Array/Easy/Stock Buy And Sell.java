Stock Buy And Sell
Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Examples
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and 
sell on day 5 (price = 6), profit = 6-1 = 5.

Note: That buying on day 2 and selling on day 1 
is not allowed because you must buy before 
you sell.

  CODE STUDIO SOLUTION----------------------------------------------------------------------------------------------------------------------------------------

  public class Solution {
    public static int bestTimeToBuyAndSellStock(int []prices) {
        // Write your code here.
         int n=prices.length;
        int min=prices[0];
        int profit=0;
        for(int i=1;i<n;i++){
            int dif=prices[i]-min;
        if(profit<dif){
            profit=dif;
        }
        if(min>prices[i]){
            min=prices[i];
        }
        }return profit;
    }
}

LEETCODE SOLUTION--------------------------------------------------------------------------------------------------------------------------------------------------

  class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=prices[0];
        int profit=0;
        for(int i=1;i<n;i++){
            int dif=prices[i]-min;
        if(profit<dif){
            profit=dif;
        }
        if(min>prices[i]){
            min=prices[i];
        }
        }return profit;
        
    }
}
