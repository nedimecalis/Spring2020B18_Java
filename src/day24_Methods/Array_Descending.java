package day24_Methods;

import java.util.Arrays;

public class Array_Descending {

    public static void main(String[] args) {

        int[] arr1 = {1,23,56,334,2,234};

        int[] arr2 = {200,542,775,3,86};

        int[] arr3 = {5,44,78,3,224,987};


    }



    public static void sortDesending(int[]arr) {

        Arrays.sort(arr);

        int[] RevArr = new int[arr.length];

        for (int i = 0; i <= arr.length - 1; i++) {
            RevArr[i] = i++;

            for (int j = 0; j > arr.length; j--) {

            }
        }

        }

    }
