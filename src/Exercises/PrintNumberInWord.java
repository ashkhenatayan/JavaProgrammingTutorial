package Exercises;

/**
 * Created by Ashkhen_A on 3/13/2017.
 */
public class PrintNumberInWord {
    public static void main(String[] args) {
        int number = 5;  // Set the value of "number" here!

        // Using nested-if
        if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } if (number == 3) {
            System.out.println("THREE");
        }
        if (number == 4) {
            System.out.println("FOUR");
        }
        if (number == 5) {
            System.out.println("FIFE");
        }
        if (number == 6) {
            System.out.println("SIX");
        }
        if (number == 7) {
            System.out.println("SEVEN");
        }
        if (number == 8) {
            System.out.println("EIGHT");
        }
        if (number == 9) {
            System.out.println("NINE");
        }
        else  System.out.println("OTHER");

        // Using switch-case
        switch(number) {
            case 1: System.out.println("ONE"); break;  // Don't forget "break"
            case 2: System.out.println("TWO"); break;
            case 3: System.out.println("THREE"); break;
            case 4: System.out.println("FOUR"); break;
            case 5: System.out.println("FIFE"); break;
            case 6: System.out.println("SIX"); break;
            case 7: System.out.println("SEVEN"); break;
            case 8: System.out.println( "EIGHT" ); break;
            case 9: System.out.println("NINE"); break;
            default: System.out.println("OTHER");
        }
    }
}
