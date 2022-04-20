public class loops {

    public static void main(String[] args) {

        int[] dailyPrices = { 4, 1, 7, 10, 11, 9, 10 };

        // for loop example
        // print 1 through 5
        System.out.println("For Loop");
        System.out.println("Print 1 through 5 integers");
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        System.out.println("----------------");
        System.out.println("While Loop");
        System.out.println("Print 1 through 5 integers");
        int j = 1;
        while (j < 6) {
            System.out.println(j);
            j++;
        }
        System.out.println("----------------");
        System.out.println("For Each Loop");
        System.out.println("Print Daily Prices");

        for (int price : dailyPrices) {
            System.out.println(price);
        }

        System.out.println("----------------");
        System.out.println("Find Max with For Each Loop");
        int maxPrice = dailyPrices[0];
        for (int price : dailyPrices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        System.out.println("The max daily price is:");
        System.out.println(maxPrice);

        System.out.println("Print the daily change in price");
        int numOfdays = 1;
        int maxReturn = dailyPrices[1] - dailyPrices[0];
        int MaxReturnIndexDay = 1;
        for (int i = 0; i < dailyPrices.length - 1; i++) {
            System.out.println("Price change for Day " + numOfdays + ":");
            int priceChange = dailyPrices[i + 1] - dailyPrices[i];
            System.out.println(priceChange);
            if (priceChange > maxReturn) {
                maxReturn = priceChange;
                MaxReturnIndexDay = i;
            }
            numOfdays++;
        }
        System.out.println("To get the Max return for Single Day Sell the stock on Day " + MaxReturnIndexDay);
        System.out.println("What day to buy stock and sell it?");

        int minPrice = dailyPrices[0];
        int maxPriced = dailyPrices[0];
        int savedMinIndex = 0;
        int savedMaxIndex = 0;
        for (int i = 0; i < dailyPrices.length; i++) {
            if (dailyPrices[i] < minPrice) {
                minPrice = dailyPrices[i];
                savedMinIndex = i;
            }
            if (dailyPrices[i] > maxPriced) {
                maxPriced = dailyPrices[i];
                savedMaxIndex = i;
            }
        }
        System.out.println("Min Price: " + minPrice);
        System.out.println("Max Price: " + maxPriced);
        System.out.println("To maximize profit, Buy on Day " + (savedMinIndex + 1));
        System.out.println("And sell on Day " + (savedMaxIndex + 1));
        System.out.println("For a profit of: " + (maxPriced - minPrice));
    }

}
