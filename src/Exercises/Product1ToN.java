package Exercises;

/**
 * Created by Ashkhen_A on 3/13/2017.
 */
public class Product1ToN {
    public static void main(String[] args) {
        long product=1;
        for (int i = 1; i <=13 ; i++) {
            product *= i;


        }
        System.out.println((long)product);

    }
}
