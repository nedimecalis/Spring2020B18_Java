package OfficeHours.Practice_04_29_2020;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArraysList_Methods {

    /*
    ArrayList: does ot support primitives
    size is dynamic, it automatically adjusting
    has index numbers
    add(): inserting
    set(): replacing
    remove(int)
    remove(object)

    add(), get(), size(),set(), remove(), clear(), indexOf(), lastIndexOf()
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
                list.add(10);
                list.add(20);
                list.add(1,30); //adds the element art the given index. sonra o indexteki bir sonrki indexe gecer
                //  {10, 30, 20}               //make sure to give valid index number,or it will print out of bound
        System.out.println(list);               //for overloading provide previous index
        System.out.println(list.size());

        //  [10, 30, 20]
        //    0,  1,  2

        int num1 = list.get(2); //returns Integer because in arraylist you can only have objects not primitives
                                // Integer 20 , unboxing

        byte a = 100;
        // Integer b = a;

        Byte a2 = 100;
        int b2 = a2; // unboxing

        ArrayList<String> list2 = new ArrayList<>();
                        list2.add("A"); // 0
                        list2.add("B"); // 1
                        list2.add("C"); // 2
                        list2.add("D"); // 3
                        //{A,B,C,D}
                        list2.add(2,"E");
        System.out.println(list2);
        for(int i = 0; i<list2.size(); i++) { // i : 0,1,2,3,4
            String str = list2.get(i);
            System.out.println(str);
        }

        System.out.println("================================================");
        for(String each : list2){
            System.out.println(each);//each element
        }

        // list2:{A,B,C,D}; replace C with F
        //        0,1,2,3
        list2.set(3,"F");// we cannot use char ' ' here because String only accepts string

        System.out.println(list2);
// set doesn change the size, add change the size




    }
}
