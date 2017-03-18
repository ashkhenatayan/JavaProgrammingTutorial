package Exercises;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by Ashkhen_A on 3/15/2017.
 */
public class CircleComputation {
    public static void main(String[] args) {
        double number;
        System.out.println("Enter a positive integer or -1 to exit: ");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius:");
        number = in.nextDouble();
        System.out.println();
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);

        while (number != -1){
            System.out.print("The area is:");
            double a=Math.PI*number*number;
            System.out.println(nf.format(a));
            System.out.print("The circumference is:");
            double b=2*Math.PI*number;
            System.out.println(nf.format(b));
            System.out.print("Enter a positive integer or -1 to exit: ");
            number = in.nextDouble();



        }

    }
}
