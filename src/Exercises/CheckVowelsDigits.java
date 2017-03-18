package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ashkhen_A on 3/16/2017.
 */
public class CheckVowelsDigits {
    public static void main(String[] args) {
        System.out.println("Enter a String:");
        Scanner in= new Scanner(System.in);
        String input=in.next().toLowerCase();
        char [] newlist= input.toCharArray();
        int [] digits={1,2,3,4,5,6,7,8,9,0};
        int vowelcount=0;
        int digitcount=0;
        for (char i: newlist){
            if (i=='a') vowelcount++;
             if(i=='e') vowelcount++;
             if(i=='i') vowelcount++;
             if(i=='o') vowelcount++;
             if(i=='u') vowelcount++;

        };
        for (char c: newlist){
            if(c >= '0' && c <= '9') digitcount++;

        }
        double kshirv=(double)vowelcount/newlist.length*100;
        double kshird=(double)digitcount/newlist.length*100;


        System.out.print("Number of vowels:");
        System.out.println(kshirv+"%");
        System.out.print("Number of digits:");
        System.out.println(kshird + "%");













    }

}
