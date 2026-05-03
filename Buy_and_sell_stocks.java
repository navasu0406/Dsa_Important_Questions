public class Buy_and_sell_stocks {
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        int result = solution(prices);

        System.out.println("Max Profit: " + result);
    }

    public static int solution(int[] prices) {
        int profit=0;
        int buy=0;
        int sell=1;
        while(sell<prices.length)
        {
            if(prices[buy]>prices[sell])
            {
               buy=sell;
            }
            else{
                profit=Math.max(profit,prices[sell]-prices[buy]);
            }
            sell++;
        }
        return profit;
    }
}
