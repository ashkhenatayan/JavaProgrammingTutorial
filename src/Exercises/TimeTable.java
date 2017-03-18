package Exercises;

/**
 * Created by Ashkhen_A on 3/14/2017.
 */
public class TimeTable {
    public static void main(String[] args) {
        System.out.println("* | 1  2  3  4  5  6  7  8  9 ");
        System.out.println("-------------------------------");

        for (int i = 1; i <=9 ; i++) {
            System.out.print(i + " |");
            for (int j = 1; j <=9; j++) {
                int k=i*j;
                if (k<10) System.out.print("  "+k);

               else  System.out.print(" "+k);

            }

            System.out.println();
            
        }


    }
}
