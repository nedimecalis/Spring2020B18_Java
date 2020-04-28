package OfficeHours.Practice_04_08_2020;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {


        /*
        bir kelimenin palindrome olup olmadigini once reverse cevirip sonra equalignoreCase kullanarak kelimeyle kiyaslamaliyiz.
         */


        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String reverse ="";
        int lastIndex = name.length()-1;

        //if(!name.isEmpty()) {// eger diyelim ki namein yazildigi yer bos mu dolumu bakicaz, onun icin condition verdik
        // name'in yerinde bisey varmi, eger bos degilse doluysa
        // ama bu tarz tasklerde boyle condition konulmaz
        for (int i = lastIndex; i >= 0; i--) {
                reverse += name.charAt(i);
            }
            if (reverse.equalsIgnoreCase(name)) {
                System.out.println(name + " is Palindrome");
            } else {
                System.out.println(name + " is not Palindrome");
            }

       // }else{
          //  System.out.println("The name is empty");
        }
    }

