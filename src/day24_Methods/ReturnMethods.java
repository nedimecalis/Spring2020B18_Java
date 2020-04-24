package day24_Methods;

import java.util.Arrays;

public class ReturnMethods {

    public static void main(String[] args) {
        int []arr= {9,8,18,192};

        int max = maxNum(arr);
        System.out.println(max);

    }

    public static int minNumber(int[]arr){
        Arrays.sort(arr);
        return arr[0];
    }



    public static int maxNum(int[] arr){
        Arrays.sort(arr);

        return arr[arr.length-1];

    }


}
