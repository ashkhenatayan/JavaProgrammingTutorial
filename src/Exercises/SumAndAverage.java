package Exercises;

/**
 * Created by Ashkhen_A on 3/13/2017.
 */
public class SumAndAverage {
    public static void main (String[] args) {
        int sum = 0;          // Store the accumulated sum, init to 0
        double average;       // average in double
        int lowerbound = 1;   // The lowerbound to sum
        int upperbound = 100; // The upperbound to sum

        // Use a for-loop to sum from lowerbound to upperbound
        for (int number = lowerbound; number <= upperbound; ++number) {
            sum += number;     // same as "sum = sum + number"
        }
        // Compute average in double. Beware that int/int produces int.
        average=sum/100;
        // Print sum and average.
        System.out.println("The sum is "+sum);
        System.out.println("The average is "+average);
    }
}
