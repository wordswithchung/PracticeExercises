package exercises;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by chungnguyen on 6/3/17.
 */
public class PracticeExercisesTest {
    PracticeExercises pe = new PracticeExercises();

    @Test
    public void testGetMaxProfit() {
        // test array with only one int
        int[] stockPrices1 = {50};
        try {
            int maxProfit1 = pe.getMaxProfit(stockPrices1);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e);
        }

        // happy path; max profit possible is 179
        int[] stockPrices2 = {5, 2, 3, 4, 90, 38, 1, 45, 180};
        int maxProfit2 = pe.getMaxProfit(stockPrices2);
        Assert.assertThat(maxProfit2, is(179));

        // stable day at the stock market; max profit possible is 0
        int[] stockPrices3 = {100, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99};
        int maxProfit3 = pe.getMaxProfit(stockPrices3);
        Assert.assertThat(maxProfit3, is(0));
    }


}