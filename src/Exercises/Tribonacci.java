package Exercises;

/**
 * Created by Ashkhen_A on 3/14/2017.
 */
public class Tribonacci {
    public static void main (String args[]) {
        int n = 4;          // the index n for F(n), starting from n=3
        int fn;             // F(n) to be computed
        int fnMinus1 = 2;   // F(n-1), init to F(2)
        int fnMinus2 = 1;
        int fnMinus3=1; // F(n-2), init to F(1)
        int nMax = 20;      // maximum n, inclusive
        int sum = fnMinus1 + fnMinus2+ fnMinus3;  // Need sum to compute average
        double average;

        System.out.println("The first " + nMax + " Tribonacci numbers are:");
        System.out.print("1 1 2 ");

        while (n <= nMax) {  // n starts from 3
            // Compute F(n), print it and add to sum
            fn=fnMinus1+fnMinus2+fnMinus3;

            System.out.print(fn+" ");


            // Increment the index n and shift the numbers for the next iteration
            ++n;
            fnMinus3=fnMinus2;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            sum=sum+fn;


        }
        System.out.println();
        System.out.println("The average is "+(double)sum/20);



        // Compute and display the average (=sum/nMax).
        // Beware that int/int give int.

    }
}
