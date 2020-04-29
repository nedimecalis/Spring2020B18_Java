package Replits.Arrays;

/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne
 */

import java.util.Arrays;
import java.util.Scanner;

public class r101_Arrays_print_first_last_char {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       // String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
        String []words ={"hello", "why", "by", "apple" , "note"};

        for (int i = 0; i < words.length; i++) {
            words[i] = "" + words[i].charAt(0) + words[i].charAt(words[i].length() - 1);
        }

        System.out.print(Arrays.toString(words));//cevabi[]icinde istiyor, o yuzden dogru cevap bu

        System.out.println();

        System.out.println("==============================================");

        String firstlast = " ";
        for(int i = 0; i<words.length;i++) {
            firstlast += " "+words[i].substring(0, 1) + words[i].substring(words[i].length() - 1);
        }
        System.out.println(firstlast);

        System.out.println("______________________________________________");

        for (String eachWord : words){
            System.out.print(" " +eachWord.substring(0,1)+ eachWord.substring(eachWord.length()-1));
        }




    }
}
