package Exercises;

import java.util.Scanner;

/**
 * Created by Ashkhen_A on 3/17/2017.
 */
public class Hex2Dec1 {
    public static void main(String[] args) {
        String hexStr;
        char hexChar;
        int decimal = 0;

        System.out.print("Enter a Hexadecimal string: ");
        Scanner in = new Scanner(System.in);
        hexStr = in.next();

        for (int pos = 0; pos <hexStr.length(); pos++) {
            int order = hexStr.length()-1-pos;
            hexChar = hexStr.charAt(pos);

            if (hexChar>='0'&& hexChar<='9'){
                System.out.println(hexChar-'0');

                decimal+=((int)(hexChar-'0')*Math.pow(16,order));
            }
            else if(hexChar>='a'&& hexChar<='f') {
                decimal += (hexChar-'a'+10)*Math.pow(16,order);
            }
            else if(hexChar>='A'&& hexChar<='F'){
                decimal += (hexChar-'A'+10)*Math.pow(16,order);
            }
            else {
                System.out.println("error: invalid hexadecimal string");
                System.exit(1);
            }

        }
        System.out.println("The equivalent decimal number \"" +hexStr + "\"" + " is: " +decimal);

    }
}
