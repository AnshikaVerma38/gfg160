// Stock Buy and Sell – Multiple Transaction Allowed
// The cost of stock on each day is given in an array price[]. Each day you may decide to either buy or sell the stock i at price[i], you can even buy and sell the stock on the same day. Find the maximum profit that you can get.

// Note: A stock can only be sold if it has been bought previously and multiple stocks cannot be held on any given day.

import java.util.*;

public class day7 {

    public static int stockBuyAndSell(int[] price, int n) {
        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (price[i] > price[i - 1]) {
                profit += price[i] - price[i - 1];
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] price = {1, 5, 3, 8, 12};
        int n = price.length;

        int maxProfit = stockBuyAndSell(price, n);

        System.out.println("Maximum Profit: " + maxProfit);
    }
}
