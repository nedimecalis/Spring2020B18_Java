package Loops;

import java.util.Scanner;

public class r84_Zombie {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt(),  day = 0;

        while (inhabitants != 0) {
            System.out.println("Day " + day + " [" + inhabitants + "]");
            day++;
            inhabitants /= 2;
        }

        System.out.println("---- EXTINCT ----");

    }

}