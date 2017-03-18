package Exercises;

import java.util.Scanner;

/**
 * Created by Ashkhen_A on 3/17/2017.
 */
public class Hex2Dec {
    public static void main(String[] args) {
        String hexStr;
        char hexChar;
        int dec = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        hexStr=in.next();

        for (int pos = 0; pos < hexStr.length(); ++pos) {
            int order = hexStr.length() - 1 - pos;
             hexChar = hexStr.charAt(pos);
            if (hexChar >= '0' && hexChar <= '9') {
                dec+=((int)(hexChar-'0')*Math.pow(16,order));
            }
            else if(hexChar >= 'a' && hexChar <= 'f'){

                dec+= ((int)(hexChar-'a'+10)*Math.pow(16,order));
            }
            else if(hexChar >= 'A' && hexChar <= 'F'){
                dec+= ((int)(hexChar-'A'+10)*Math.pow(16,order));
            }
            else {
                System.out.println("error: invalid hexadecimal string");
                System.exit(1);    // quit the program
            }

            }
        System.out.println(dec);


    }
}
