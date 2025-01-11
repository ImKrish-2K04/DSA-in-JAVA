public class BuyAndSellStocks {

    public static void stockPurchaseAndSellManager(int arr[]) {
        // Initialize buyingPrice to a large negative value for comparison.
        // We'll also track maxProfit, which starts at 0.
        int buyingPrice = Integer.MIN_VALUE, sellingPrice, profit, maxProfit = 0;

        // Set the initial buying price to the first day's stock price.
        buyingPrice = arr[0];

        // Loop through each day's stock price.
        for (int i = 0; i < arr.length; i++) {
            // Set the selling price to the current day's price.
            sellingPrice = arr[i];

            // Calculate the profit from selling on this day.
            profit = sellingPrice - buyingPrice;

            // Update maxProfit if the current profit is greater.
            maxProfit = Math.max(maxProfit, profit);

            // If the current price is lower than the buying price,
            // update buyingPrice to minimize the cost for future profits.
            if (sellingPrice < buyingPrice) {
                buyingPrice = sellingPrice;
            }
        }

        // Output the maximum profit that can be achieved.
        System.out.println("The maximum profit one can earn is: " + maxProfit);

        // Time complexity: O(n) since we traverse the array once.
        // Space complexity: O(1) as no extra data structures are used.
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        stockPurchaseAndSellManager(arr);
    }
}
