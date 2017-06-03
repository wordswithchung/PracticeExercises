package exercises;

/**
 * Practice algorithmic exercises.
 *
 */
public class PracticeExercises {

    /**
     * Stock prices are provided
     * @param stockPrices
     * @return maximum profit possible, given the list of stock prices provided
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

