package Replits.Methods;

import java.util.Scanner;

public class replit146_Split_Replace {

/*
The method person get a string with this format : "name,last name,age"
for example:

person("jon,doe,30");

the output is:

person name: jon last name: doe age: 30

hint: use the split method to split the string to a string array where there is a "," char
 */


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s =inp.next();
        person(s) ;
    }

    public static void person(String info){//jon,doe,30
        info=info.replace(","," ");
        String [] sArray=info.split(" ");// {"jon","doe", 30}
        System.out.println("Person name: "+sArray[0]+" last name: "+sArray[1]+" age: "+sArray[2]);
    }
}


