package Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Ashkhen_A on 3/15/2017.
 */
public class FileScanner {
    public static void main(String[] args) throws FileNotFoundException {  // Needed for file operation
        int num1;
        double num2;
        String name;
        double sum;

        // Setup a Scanner to read from a text file
        Scanner in = new Scanner(new File("src/Exercises/in.txt"));
        num1 = in.nextInt();      // use nextInt() to read int
        num2 = in.nextDouble();   // use nextDouble() to read double
        name = in.next();         // use next() to read String

        System.out.print("Enter an integer: ");
        System.out.println(num1);
        System.out.print("Enter a floating point number: ");
        System.out.println(num2);
        System.out.print("Enter your name: ");
        System.out.println(name);
        System.out.print("Hi! "+name +", the sum of  "+ num1+ " and "+num2+" is ");
        System.out.println(num1+num2);


        in.close();
    }

}
