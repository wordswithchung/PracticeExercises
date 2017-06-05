package exercises;

/**
 * Practice algorithmic exercises.
 */
public class PracticeExercises {

    /**
     * Takes an array of integers (haystack) and finds the integer (needle) parameter. If the integer is not in the
     * array provided, it returns -1.
     * @param haystack (sorted array of integers)
     * @param needle (integer)
     * @return index for needle in haystack array; if needle does not exist, returns -1
     */
    public int binarySearch(int[] haystack, int needle) {
        if (haystack.length < 1) {
            return -1;
        }

        int start = 0;
        int mid;
        int end = haystack.length;
        while (start <= end) {
            mid = (end - start) / 2;
            if (haystack[mid] < needle) {
                start = mid + 1;
            } else if (needle == haystack[mid]) {
                return mid;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    /**
     *  Takes an array of integers and returns an array of the products without using division.
     *  @param integers
     *  @return array of integers with products of all ints except for the int at index
     */
    public /*int[]*/ void getProductsOfAllIntsExceptAtIndex(int[] integers) {
         if (integers.length < 2) {
             throw new IllegalArgumentException("At least two integers are required to calculate products");
         }
/*
         int[] integersBeforeIndex = new int[integers.length];
         integersBeforeIndex[0] = 1;
         // get all products before ++
        for (int i = 1; i < integers.length; i++) {
             int  = integers[i - 1];
        }
*/
        // get all products after --
    }

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

