package Exercises;

/**
 * Created by Ashkhen_A on 3/15/2017.
 */
public class PrintPattern1 {
    public static void main(String[] args) {
        int i, j, k;
        for(i=8;i>=1;i--)
        {
            for(j=8;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {

                System.out.print("#");


            }
            System.out.println();
        }

    }
}

