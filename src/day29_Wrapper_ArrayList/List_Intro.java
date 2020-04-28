package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Intro {

    public static void main(String[] args) {

        //ArrayList<DataType> listName = new ArrayList<DataType>();

        //ArrayList <int> scores = new ArrayList<int>(); // compile error, because arraylist doesnot accept primitive
        //ArrayList should be class such as Integer, Byte..

        ArrayList <Integer> scores = new ArrayList<Integer>();
        //     DataType is Mandatory           2.DataType is not mandatory

        //int [] arr = new int [3]; // for example max element you can store in the array
        //you cannot initializa size of Arraylist
        // its size depending on adding or removing it is dynamic. automaticaly adjusted every single time

       // ArrayList <Integer> scores = new ArrayList<Integer>();//size; 0
                                                                //add five element, size:5
                                                                // remove two elemets, size :3


        scores.add(10); // Autoboxing, it converts primitive to wrapper class. size:1
        scores.add(20); // Autoboxing , size : 2
        scores.add(20); // Autoboxing , size : 3


        System.out.println(scores); // we dont have to write toString it automaticaly converts

        Integer a1 = scores.get(2);// none , assiginin wrapper class to wrapper class,
        int a2 = scores.get(2); // unboxing , assignin wrapper class to primitive
        double a3 = scores.get(2); //unboxing , assignin wrapper class to primitive

        System.out.println(a1);

        //System.out.println(scores.get(100));// index out of bound

        //whenever we use get we need to make sure it exists not out of bound








    }


}
