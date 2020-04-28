package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Reverse {
    /*
    2. write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
     */


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i<6 ; i++){// I want i to represent to element not numbers, it represent now 1-5
                list.add(i);
        }
        System.out.println(list);


        ArrayList<Integer>reversedList = new ArrayList<>();//to store reverse order into another Arraylist

        //list.size()-1 ---- last index
        for(int i = list.size()-1; i>= 0; i--) {// for each loop yu can not use because it starts from begining to end
            int eachNum = list.get(i);//unboxing // to retriev elemenets , returns me integer. // eachNum represents eachh element reverse
           reversedList.add(eachNum);//if I dont write this blank [] will be printed on the console
            // System.out.print(eachNum + " "); we write ArrayList so we dont write sout
        }

        System.out.println(reversedList);






    }






}
