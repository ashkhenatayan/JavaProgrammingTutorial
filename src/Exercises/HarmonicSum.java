package Exercises;

/**
 * Created by Ashkhen_A on 3/13/2017.
 */
public class HarmonicSum {
    public static void main(String[] args) {
        int maxDenominator = 50000;  // Use a more meaningful name instead of n
        double sumL2R = 0.0;    // sum from left-to-right
        double sumR2L = 0.0;    // sum from right-to-left
        for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
            sumL2R=sumL2R+(double)1/denominator;
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);
        for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
            sumR2L=sumR2L+(double)1/(maxDenominator-denominator+1);
        }
        System.out.println("The sum from left-to-right is: " + sumR2L);
    }
}
