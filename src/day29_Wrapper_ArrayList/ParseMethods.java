package day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {
        String str = "123";

        Integer.parseInt(str);// 123 // convert string to int so I can assign it to int primitive
        int a1 = Integer.parseInt(str);

        System.out.println(str);//123__text //compiler treats as a text
        System.out.println(a1); //123__number // compiler treats it as number

        System.out.println(str+1);// 1231 , ("123"+1) it concates because it is string

        System.out.println(a1+1);// 124, it adds because it is number


        Byte.parseByte(str);// datatype- byte primitive = 123

        byte b1 =  Byte.parseByte(str);
        System.out.println(b1);
        // if we want to see if it is number or not just add number
        System.out.println(b1+5);

        //Integer I1 = Byte.parseByte(str);//because wrapper class only accepts its primitive

        // byte primitive is not accepted in integer warpper class

        Integer I1 = (int) Byte.parseByte(str); // AutoBoxing // we did casting
        // Integer only accepts int
        //Integer = (int)byte;
        //Integer = int;
        // when you cast ,use primitive that is dedicated to its class



       // int a = 100;
       // double b = a;//not autoboxing or unboxing


        String str2 = "10.5";

        float f1 = Float.parseFloat(str2);// float 10.5
        // datatype is a primitive so it is number now
        System.out.println(f1);
        System.out.println(f1+1); //11.5

        double f2 = Double.parseDouble(str2); // double 10.5
        // both of them returning two different datatype , float 10.5 and double 10.5
        // value of them depends on the String

        System.out.println(str2);


        String str3 = "3147483647";

        long l1 = Long.parseLong(str3);//assing primitive to primitive . not auto or not unboxing

        System.out.println(str3);// String
        System.out.println(l1); // number

        Long l2 = Long.parseLong(str3); // autoboxing
        System.out.println(l2+2);// it adds because it is number

        String result1 = "true";

        boolean r1 = Boolean.parseBoolean(result1); // boolean
        System.out.println(r1);
        System.out.println(!r1);// I can understand if it is boolean or not with adding !

        String result2 = "false";

        boolean r2 = Boolean.parseBoolean(result2);
        System.out.println(!r1); //true
        //in java default value of boolean is false


        String result3 = "Today is Monday";// if it is not true or false it will return you false

        boolean r3 = Boolean.parseBoolean(result3);
        System.out.println(r3);

        String result4 = "9>7";// it does not match "true" or "false"
        // any string not "true" or "false" returns you false
        //whatever you write not "true" is alwys false

        boolean r4 = Boolean.parseBoolean(result4);
        System.out.println(r4);

        String result5 = "tRuE"; //not case sensitive, cares about only meaning

        boolean r5 = Boolean.parseBoolean(result5);
        System.out.println(r5);

        String result6 = "FaLse";

        boolean r6 = Boolean.parseBoolean(result6);
        System.out.println(r6);
        // parse method ignores case sensitivity



















    }
}
