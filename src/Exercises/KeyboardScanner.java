package Exercises;

import java.util.Scanner;

/**
 * Created by Ashkhen_A on 3/15/2017.
 */
public class KeyboardScanner {
    public static void main(String[] args) {
        int num1;
        double num2;
        String name;
        double sum;

        // Setup a Scanner called in to scan the keyboard (System.in)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num1 = in.nextInt();     // use nextInt() to read int
        System.out.print("Enter a floating point number: ");
        num2 = in.nextDouble();  // use nextDouble() to read double
        System.out.print("Enter your name: ");
        name = in.next();        // use next() to read String

        // Display
        System.out.print("Hi! "+name +", the sum of  "+ num1+ " and "+num2+"is ");
        System.out.println(num1+num2);

        // Close the input stream
        in.close();
    }
}
