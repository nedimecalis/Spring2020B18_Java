package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;

public class return_method2 {

    //write a return method that can give me the second max num



    public static void main(String[] args) {

        int [] arr = {10,4,78,34,235,45,-2-55};

        Arrays.sort(arr);// neden array classindan cagiriyoruz, cunku specifier is static eger bir metodu classtan ararsak bu kesin statictir

        System.out.println(Arrays.toString(arr));// neden Arraysden ariyoruz cunku static. array is overloading cunku Stringin bir sruru turu var butun datataypelari aliyo, int, char, byte..

        int lastIndexNum = arr.length;//bunu yazinca arrayin icindekilerin kac tane oldugunu yaziyo
        int secondLastIndexNum = arr.length-2;

        int secondMaximumnum=arr[secondLastIndexNum];//ikinci max numbe verecek

        System.out.println(lastIndexNum);
        System.out.println(secondLastIndexNum);
        System.out.println(secondMaximumnum);

        int[] arr2 = {1,2,3,4,5,6};

        int num2 = secondMax(arr2);// variable'a veriyoruz reusable olsun diye

        System.out.println(arr2);//boyle yazarsam ## prints olur
        System.out.println(Arrays.toString(arr2));//butun {} icini print ediyo
        System.out.println(num2);// seconMax veriyo, cunku variable'a assign ettim

    }

    public static int secondMax(int[]arr){

        Arrays.sort(arr);// neden array classindan cagiriyoruz, cunku specifier is static eger bir metodu classtan ararsak bu kesin statictir

        System.out.println(Arrays.toString(arr));// neden Arraysden ariyoruz cunku static. array is overloading cunku Stringin bir sruru turu var butun datataypelari aliyo, int, char, byte..

        int lastIndexNum = arr.length;//bunu yazinca arrayin icindekilerin kac tane oldugunu yaziyo
        int secondLastIndexNum = arr.length-2;

        int secondMaximumnum=arr[secondLastIndexNum];//ikinci max numbe verecek

        return secondMaximumnum;

    }

}
