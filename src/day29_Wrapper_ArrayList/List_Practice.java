package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice {

    public static void main(String[] args) {


        ArrayList<String> shoppingList = new ArrayList<>(); // the size will be automaticaly adjusted, dynamic

        shoppingList.add("Milk");   // size:1
        shoppingList.add("Coffee");// size:2
        shoppingList.add("Bread");//size:3
        shoppingList.add("Toilet paper");// size:4
        shoppingList.add("eggs"); // sonradan ekledik

        System.out.println(shoppingList);

        /*
        System.out.println(shoppingList.get(0)); // to retrieve element I need to write get ()
        System.out.println(shoppingList.get(1));
        System.out.println(shoppingList.get(2));
        System.out.println(shoppingList.get(3));

         */

        for(int i = 0; i<4 ; i++){ // i: 0,1,2,3 // sonradan 4. element ekledik 4 oldugu icin son element yazmadi
            System.out.println(shoppingList.get(i));
        }

        for(int i = 0; i<shoppingList.size() ; i++){
            System.out.println(shoppingList.get(i));
        }


        System.out.println("============================================================");

        for(String each:shoppingList) {
            //element  //data collection
            System.out.println(each); //each prints us every single element
        }


        //size() ;

        int size = shoppingList.size();
        System.out.println(size);

        int lastIndex = shoppingList.size()-1;
        System.out.println(lastIndex);






    }




}
