package day16_ForLoop;

import java.util.Scanner;

public class CalculateSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++) {
          sum += i; // 1 + 2 + 3 + 4 + 5 = 15
        }

        System.out.println(sum);

    }
}
