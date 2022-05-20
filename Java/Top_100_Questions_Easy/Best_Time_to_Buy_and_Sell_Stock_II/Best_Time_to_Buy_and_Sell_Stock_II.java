package LeetCode.Java.Top_100_Questions_Easy;
class Solution {
    public int maxProfit(int[] prices) {
        int valley = prices[0];
        int peak = prices[0];
        int i = 0;
        int profit = 0;
        
        while(i < prices.length - 1) {
            while(i < prices.length - 1 && prices[i] >= prices[i+1]) {
                i++;
            }
            valley = prices[i];
            while(i < prices.length -1 && prices[i] <= prices[i+1]) {
                i++;
            }
            peak = prices[i];
            profit += peak - valley; 
        }
        return profit;
    }
}