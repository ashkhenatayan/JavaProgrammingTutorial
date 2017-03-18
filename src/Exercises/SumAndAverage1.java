package Exercises;

/**
 * Created by Ashkhen_A on 3/13/2017.
 */
public class SumAndAverage1 {
    public static void main(String[] args) {
        int sum = 0;          // Store the accumulated sum, init to 0
        double average;       // average in double
        int lowerbound = 1;   // The lowerbound to sum
        int upperbound = 100; // The upperbound to sum
        int number = lowerbound;
        int count=0;

        while (number <= upperbound ){
            sum+=number*number;
           ++number;
        }

        System.out.println("The sum is "+sum);
       ;
    }
}
