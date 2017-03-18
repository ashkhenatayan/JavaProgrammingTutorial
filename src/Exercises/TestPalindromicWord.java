package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ashkhen_A on 3/16/2017.
 */
public class TestPalindromicWord {
    public static void main(String[] args) {
        String inStr;        // input String
        int inStrLen;        // length of the input String

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = in.next().toLowerCase();   // use next() to read a String
        inStrLen = inStr.length();
        ArrayList<Character> list= new ArrayList<>();
        for (int i = inStrLen - 1; i >= 0; --i) {  // Process the String from the right
            list.add(inStr.charAt(i));
        };
        String listString = "";
        for (Character s : list)
             {
                 listString += s ;
             };
        if(inStr.equals(listString)) {
            System.out.println(inStr +" is a palindrome");
        }
        else System.out.println(inStr +" is not a palindrome");


    }

}
