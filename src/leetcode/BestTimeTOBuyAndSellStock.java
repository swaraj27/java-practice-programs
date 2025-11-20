package leetcode;

public class BestTimeTOBuyAndSellStock {
    public static void main(String[] args) {

        int prices [] = {7,6,4,3,1}; //{7,1,5,3,6,4}
        System.out.println("max profit " + maxProfit(prices));
    }

    public static int maxProfit(int prices[]){
        int n = prices.length;
        int max_profit = 0;
        int buy_price = prices[0];

        for(int i=1 ; i< n; i++){

            int currentProfit = prices[i] - buy_price;

            if(currentProfit > max_profit){
                max_profit = currentProfit;
            }

            if(prices[i] < buy_price){
                buy_price = prices[i];
            }

        }

        return max_profit;
    }
}
