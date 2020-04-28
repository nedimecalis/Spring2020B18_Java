package OfficeHours.Practice_04_08_2020;

public class ForLoops_Practice {

    public static void main(String[] args) {


        for (int i = 0; i <= 5; i++){
            System.out.println("Hello world ");//loop bodynin icine bisey(sout) yazmadiktan sonra hic bir islem olmaz
        }

         for(int i = 1;  i <= 5; i+=2 ){ //  i++: 1, 2, 3, 4, 5
            // i+=2: 1, 3, 5
            System.out.println("Hello World " + i);
        }

        System.out.println("===========================");

        for(int i =1; i <= 5;){

            System.out.println(i); //1 2 3 4 5
            i++;

        }


    }

}