package Exercises;

/**
 * Created by Ashkhen_A on 3/14/2017.
 */
public class CheckerBoard {
    public static void main (String[] args) {
        int size = 7;    // size of the board

        for (int row = 1; row<=size; ++row) {
            // Use modulus 2 to find alternate lines
            if ((row % 2) == 0) {   // row 2, 4, 6, 8
                System.out.print(" ");
                System.out.print("# ");

            }
            else { // row 2, 4, 6, 8
                System.out.print("# ");

            }

            for (int col = 1; col<size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
