package Exercises;

import java.util.Scanner;

/**
 * Created by Ashkhen_A on 3/17/2017.
 */
public class Bin2Dec {
        public static void main(String[] args) {
            String binStr;    // The Input binary string
            int binStrLen;    // Length of the input string
            int dec = 0;      // The equivalent decimal number, accumulate from 0
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a Binary string: ");

            // Read input into binStr and compute binStrLen
            binStr=in.next();
            binStrLen=binStr.length();
            // Convert the binary string to decimal, starting from the most-significant digit (left)

            for (int pos = 0; pos < binStrLen; ++pos) {
                int order = binStrLen - 1 - pos;
                char binChar = binStr.charAt(pos);
                // 3 cases: '1' (add to dec), '0' (do nothing), others (error)
                if (binChar == '1') {
                    dec+=Math.pow(2,order);

                } else if (binChar != '0') {
                    System.out.println("error: invalid binary string \"" + binStr + "\"");
                    System.exit(1);
                }  // else for '0' - do nothing
            }


        }
}
