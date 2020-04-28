package OfficeHours.Practice_04_15_2020;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int[]inputs = new int [5];

        for(int i =0; i<inputs.length; i++){
            System.out.println("Enter a number");
            inputs [i] = scan.nextInt();
        }
        for(int i =0; i< inputs.length; i++){
            System.out.print(inputs[i]+" ");
        }





    }
}
