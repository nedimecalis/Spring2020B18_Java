package OfficeHours.Practice_04_22_2020;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class return_Method {

    public static void main(String[] args) {

        //int a = sum(10,20);// void

      // sum2("1","2"); ->olmaz it doesnt match with parameter

      int num1= sum2(10,20);//return method

        System.out.println(num1);

        System.out.println("================================================");

        String str = "Cybertek";
        String result = "";
        for(int i = str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }

        System.out.println(result);

        String name = "level";

        String name2 = reverse(name);

        System.out.println((reverse(name)));// we can write it like that but it only prints name, it is not going to be reusable

        System.out.println(name2);

        System.out.println(name.equals(name2));//Palindrome. equals yazinca prints truenor false cikiyo

    }


    public static void sum(int a, int b){

        System.out.println(a+b);

    }

    public static int sum2(int a,int b) {

        // return 123;->boyle yazdsaydim her zaman bana 123 verecekti , yukarda return olarak sum2 bile yazsam
        return (a + b);
    }


    public static String reverse(String str){

        String result = "";

        for(int i = str.length()-1; i>=0; i--){

            result+=str.charAt(i);
        }

        return result;
    }





}
