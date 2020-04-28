package day29_Wrapper_ArrayList;

import Resources.Library;

import java.util.ArrayList;

public class List_Practice2 {

     /*
        1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list
                Do not use any sorting
         */

     public static void main(String[] args) {


          ArrayList<Integer> list = new ArrayList<>();

          list.add(100);
          list.add(20);
          list.add(300);
          list.add(400);
          list.add(50);
          list.add(700);
          list.add(800);

          //int size = list.size();// size baktik 5
          // System.out.println(size);


          int maximum = Integer.MIN_VALUE;// every single element is greater than this number that is why we give maximum
          //int maximum = list.get(0); // both of them same , they are assigining the first value
          // minimum value of integer will allways be greater than the numbers we write. it is -214783638

          //int maximum = 0; // yazmiyoruz cunku bazi sayilar - negatif olabilir

          for (int i = 0; i < list.size(); i++) { //this loop will iterarte every single index, I will compare it with maxNum
               if(list.get(i)>maximum) { //list.size() will get me each index. index 0->100 > max ,index 1->20> max,(bu 100'den buyuk olmadigi icin hala maximum yani i =100, index 3 ->300>i, 400>i, 50>i. hepsinde maximumun yerine i geciyo eger buyukse kaliyo kucukse gidiyo
                                        // 100 > -214783638, 20 >-214783638, 300>-214783638....
                    maximum = list.get(i);
               }
               //System.out.println(maximum);// buraya yazinca butun rakamlar yaziliyo
          }
          System.out.println(maximum);


          int maximum2 = Integer.MIN_VALUE;

          for(Integer each : list){// each represents each object from list, data collection is list

               if( each > maximum2 ) {
                    maximum2 = each;
               }
          }

          System.out.println(maximum2);



          ArrayList<Integer>list2 = new ArrayList<>();
               list2.add(100);
               list2.add(200);
               list2.add(300);

               int maximum3 = max(list2);
          System.out.println(maximum3);

          int maximum4 = Library.max(list2); // calling from Library
          System.out.println(maximum3);



     }

     public static int max(ArrayList<Integer>list){

          int maximum = Integer.MIN_VALUE;
          for (int i = 0; i < list.size(); i++) {

               if(list.get(i)>maximum) {
                    maximum = list.get(i);
               }
          }

          return maximum;
     }


}
