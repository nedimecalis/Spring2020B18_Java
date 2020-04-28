package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(5);
            list1.add(7);
            list1.add(8);

            list1.add(1,6);//
            // when you add an element you insert element to arraylist so other' index number will change. it will automatically adjusted
            //list1.add(7,10); // you need to write valid index, if we wriye an iindex that doesnt exist it will say out of bound

        System.out.println(list1);


        int[] arr = {1,2,3,4};//this is an array not ArrayList
        arr[3]=5; // how we change the index in the array

        list1.set(3,9);
        System.out.println(list1);

        System.out.println("===============================================");

        ArrayList<String>list2 = new ArrayList<>();
        list2.add("A");//{A}
        list2.add("B");//{A,B}
        list2.add(1,"C");//{A,C,B} -- C is inserted
        list2.add(1,"D");//{A,D,C,B} -- D is inserted and push C to next index
        // Java executes top to bottom
        System.out.println(list2);

        list2.set(3,"F");// {A,D,C,F}
        list2.set(2, "E");//{A,D,E,B}
        System.out.println(list2);

        // add() --> adds (doesn't remove)
        // set() --> adds(replaces)

        System.out.println("===========================================================");

        ArrayList<Integer>list3 = new ArrayList<>();

                list3.add(1); // 0
                list3.add(2); // 1
                list3.add(3); // 2
                list3.add(4); // 3
                list3.add(5); // 4

        int a = 1; //if I pass index number whatever element that index no will be removed
        list3.remove(a); // {1, 3, 4} // a is taken as index number

        // list3.remove(1); // when you pass int it will be taken as index number

        System.out.println(list3);
        Integer b =1;
        list3.remove(b);
        // whenevr you pass an object the given object will be removed, not index number

        System.out.println(list3);

        // int --- index
        // Integer -- object
        // remove method only removes first

        System.out.println("===============================================");
        ArrayList<Integer>list4 = new ArrayList<>();

        list4.add(10); // 0
        list4.add(20); // 1
        list4.add(30); // 2
        list4.add(40); // 3
        list4.add(50); // 4

        //list4.remove(20); // index out of bond

        list4.remove (1);

        System.out.println(list4);

        Integer a2 = 30;
        list4.remove(a2);

        System.out.println(list4);

        boolean r1 = list4. remove(a2);// it will remove then write boolean// false because I already removed a2

        System.out.println(r1);

        Integer a3 = 50;
        boolean r3 = list4.remove(a3);

        System.out.println(r3);
        System.out.println(list4);











    }

}
