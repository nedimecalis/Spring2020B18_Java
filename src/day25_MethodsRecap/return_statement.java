package day25_MethodsRecap;

public class return_statement {


    public static void main(String[] args) {


        method1();// bundan sonra sout yazinca console sout yazilir
        method2();// bunda system in oldugu icin hicbisey cimaz

        System.out.println("Hello");

    }

    public static void method1(){

        if(10>9){
            return;//bu sistemi durdurmaz sadece current methoddan exit eder
        }

        System.out.println("Cybertek School");

    }

    public static void method2(){

        if(10>9){
            System.exit(0); //butun programi exit eder, consoleda hicbisey cikmaz
        }

        System.out.println("Cybertek School");

    }



}
