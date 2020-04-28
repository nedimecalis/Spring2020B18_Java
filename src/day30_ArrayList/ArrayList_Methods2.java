package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");

        //list1.remove(1);// removes the index 1

        String str1 = "B";
        //list1.remove(str1);
        boolean r1 = list1.remove(str1);// true we write this to see if the element is removed

        System.out.println(list1);
        System.out.println(r1);

        String str2 = "Z";
        boolean r2 = list1.remove(str2);

        System.out.println(r2);

        boolean r3 = list1.remove("A");

        System.out.println(r3);


        list1.clear();//[] // after clear we cannot get it back

        System.out.println(list1);
        System.out.println(list1.size());

        System.out.println("=============================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1); // 0
        list2.add(1); // 1
        list2.add(2); // 2
        list2.add(3); // 3
        list2.add(4); // 4

       int num1 = list2.indexOf(1);// index number is int. here int will be assigned to Integer , because indexOf only accepts objects
                        // Integer = int// Autoboxing
        System.out.println(num1);

        int num2 = list2.indexOf(100);
        System.out.println(num2);

        int num3 = list2.indexOf(3);//3
        System.out.println(num3);






    }





}
