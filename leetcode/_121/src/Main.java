public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] list = {1, 7, 3, 6, 5, 6};
        System.out.println(solution.maxProfit(list));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];
        int profit = 0;
        int mostProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int value = prices[i];
            if(value > low){
                profit = value - low;
            }

            if (value < low) {
                low = value;
            }
            if(mostProfit < profit){
                mostProfit = profit;
            }
        }
        return mostProfit;
    }
}