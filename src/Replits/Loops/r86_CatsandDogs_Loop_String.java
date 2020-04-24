package Replits.Loops;

/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.
Example:
input: catdog
output: true

Example:
input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false
 */

import java.util.Scanner;

public class r86_CatsandDogs_Loop_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        while(word.contains("cat") || word.contains("dog")){
            if(word.contains("cat")){
                word=word.replaceFirst("cat","");
                countOfCats++;
            }else if(word.contains("dog")){
                word=word.replaceFirst("dog","");
                countOfDogs++;
            }
        }
        if(countOfCats==countOfDogs){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


       /*
        for (int i = 0; i < word.length() - 2; i++) {

            if (word.substring(i, i + 3).equals("cat"))
                countOfCats++;

            if (word.substring(i, i + 3).equals("dog"))
                countOfDogs++;

        }

        System.out.println((countOfDogs == countOfCats) ? true : false);

        */



    }
}
