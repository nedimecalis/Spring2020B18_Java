package Replits.Loops;

/*
A sandwich is two pieces of bread with something in between.
Print the string that is between the first and last appearance of "bread" in the given string,
or return string "nothing" if there are not two pieces of bread.

Example:
input: breadjambread
output: jam

Example:
input: xxbreadjambreadyy
output: jam

Example:
input: xxbreadapple
output: nothing

Example:
input: breadbutterbread
output: butter
 */

import java.util.Scanner;

public class r95Get_Sandwich_Loop_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String between = "nothing";

        if (str.indexOf("bread") != -1 )
            if(str.lastIndexOf("bread") != str.indexOf("bread"))
                between = str.substring(str.indexOf("bread") + 5,  str.lastIndexOf("bread"));

        System.out.println(between);
    }

    }

    //  int indexOfFirstBread=str.indexOf("bread");
//        int indexOfSecondBread=str.lastIndexOf("bread");
//         if(indexOfFirstBread>=0 && indexOfSecondBread>=0 && (indexOfFirstBread!=indexOfSecondBread)){
//            System.out.println(str.substring(indexOfFirstBread+5,indexOfSecondBread));
//        }else{
//            System.out.println("nothing");
//        }

