package Replits.Arrays;

import java.util.Scanner;

public class r114_Arrays_find_non_duplicate_Loop {
    /*

Given an array nums with 7 integers every element is repeated twice - except one.
Find that element and print it to console.
Example:
nums -> [1, 1, 2, 3, 4, 3, 4]
         2
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int[] nums = {1, 1, 2, 3, 4, 3, 4};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(nums[i]);
            }
        }

/*  Finding duplicate
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
        */
}

}

