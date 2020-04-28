package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class ValueOfMethods {

    public static void main(String[] args) {

        String str = "123";

        Integer a = Integer.valueOf(str); //Integer, 123
        // assign wrapper class to wrapper class
        //Inteher here does not accept anythig other then int

        System.out.println(a);

        double b = Integer.valueOf(str);// primitives can take any class, they dont care
        // double = Integer
        // assiginin warpper class to primite unboxing

        System.out.println(b); //123.0 because decimal datatype


        String str2 = "15.5";// I can use parse or value method, it doesnt matter
        double d1 = Double.parseDouble(str2);// returns me primitive
        // double = double //not auto not un boxing

        double d2 = Double.valueOf(str2);//returns me wrapper class //15.5
        // double = Double // unboxing

        System.out.println(d1); // 15.5
        System.out.println(d2); // 15.5

        System.out.println(d1 == d2); // true

        System.out.println("==================================");

        int z1 = 2000;
       //Long L1 = z1; // compile error//
        //datatype does not accept any other primitive except long

        Short sh1 = 3000;
        int z2 = sh1;
        // primitives doesnt care it can take anything

        //Wrapper class --- LOYAL
        //primitive ---- NOT LOYAL

        String r1 = "true";
        Boolean t1 = Boolean.valueOf(r1);// Boolean, true
                    //Boolean = Boolean //none

        boolean t2 = Boolean.valueOf(r1); //Boolean,
        //boolean = Boolean // unboxing

        System.out.println(t1);
        System.out.println(t2);

        // ValueOf is not case sensitive

        System.out.println("================================");

        int maxNum = Integer.MAX_VALUE;
        //it will take the max number of the primitive

        System.out.println(maxNum); //2147483647 - gives max value of int primitive

        double maxNum2 = Double.MAX_VALUE;
        System.out.println(maxNum2);//1.7976931348623157E308

        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum); //-2147483648 , smallest number that int can take

        byte maxNum3 = Byte.MAX_VALUE;
        System.out.println(maxNum3);

        byte minNum3 = Byte.MIN_VALUE;
        System.out.println(minNum3);


        System.out.println("=========================");

        System.out.println("=================================");

        char[] arr = new char[3];
        System.out.println(Arrays.toString(arr) );

        Integer[] arr2 = new  Integer[3];
        System.out.println(Arrays.toString(arr2) );

        // all default values of ValueofMethod is null









    }
}
