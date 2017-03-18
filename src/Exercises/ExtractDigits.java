package Exercises;

/**
 * Created by Ashkhen_A on 3/14/2017.
 */
public class ExtractDigits {
    public static void main(String[] args) {
        int n=15423;
        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit+" ");
            n=n/10;


        }


    }
}
