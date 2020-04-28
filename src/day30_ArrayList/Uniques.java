package day30_ArrayList;

import java.util.ArrayList;

public class Uniques {
    /*
     4.	write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}

     */

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();// {1,2,1}
        list.add(1);
        list.add(2);
        list.add(1);
        //list.get(0) --> 1

        ArrayList<Integer> uniques = new ArrayList<>();

        for(int i = 0; i < list.size(); i++) {

            int count = 0;// will count how many time list.add(1); is occured
            for (Integer each : list) {// each data is Integer, I can use int too but
                if (each == list.get(i)) {// if they are equa 'i will increase the count +1,// this will shoe how many time element is occured
                    //0 1 2
                    count++;// if element is actuallly unique I will add to uniques
                }
            }
            if (count == 1) {
                uniques.add(list.get(i)); // 0 1 2
            }

        }

        System.out.println(uniques);
        System.out.println(list);

    }

}
