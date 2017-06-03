package exercises;

/**
 * Practice algorithmic exercises.
 */
public class PracticeExercises {

    /**
     * Stock prices are provided in an array. getMaxProfit() generates the maximum profit achievable by looping through
     * each price once and keeping track of the smallest price available, then comparing the potential profit with the
     * current maximum profit every time, updating as needed.
     * <p>
     * Note: one must buy a stock before selling it.
     * @param stockPrices
     * @return the best profit to be made from 1 purchase and 1 sale of 1 stock
     */
    public int getMaxProfit(int[] stockPrices) {
        if (stockPrices.length < 2) {
            throw new IllegalArgumentException("At least two stock prices are required to calculate max profit");
        }

        int minPrice = stockPrices[0];
        int maxProfit = stockPrices[1] - stockPrices[0];

        for (int i = 1; i < stockPrices.length; i++) {
            int currentPrice = stockPrices[i];

            int potentialProfit = currentPrice - minPrice;

            maxProfit = Math.max(maxProfit, potentialProfit);

            minPrice = Math.min(minPrice, currentPrice);
        }

        return maxProfit;
        }
    }

