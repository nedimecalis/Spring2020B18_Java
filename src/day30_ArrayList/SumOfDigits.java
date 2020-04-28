package day30_ArrayList;

import java.util.Arrays;

/*
1. write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits

 */
public class SumOfDigits {

    public static void main(String[] args) {

        //if I use split metod it will give me string, but I need to slit them to chars
        //from char array I need to find out every single digit because we need to sum them
        // ito identify data we creat an arrey out of string
        String str = "a1b2c3";
        char[]arr =str.toCharArray();
        System.out.println(Arrays.toString(arr));// shara donusturduk sonra yazdik baktik

        //in order to iterate the elemenets we use for each loop

       int sum = 0; //the purpose of creting sum is will contain sum of all digits

        for(char each:arr) {//represents char primitives so that i will find the element from

            // if the each is digit I will convert all the characters to the digit then add them,
            // from ascii table if they are digits their number is from 48 to 57
            // boolean isDigit = each >= 48 && each <= 57;
            // to convert '0' to int I will use parse method, but we use it to convert string to int, but this is char therefore i concate to "" to make it strin
            //parse method convert char to digit
            // whenever the number is digit that wiil add
            // if (isDigit) { //isDigit = each >= 48 && each <= 57; in stead of boolean we can make this too. if each is digit , we will convert to int and add it to sum
            // sum += Integer.parseInt("" + each);// whenever each is digit that character will add to sum
            //}

            if (Character.isDigit(each)) {// isDigit used for identifies if the given character is digit
                sum += Integer.parseInt("" + each);
            }
        }
        System.out.println(sum);
        boolean a = Character.isAlphabetic('A');// identifies if the character is alphabet


    }
}
