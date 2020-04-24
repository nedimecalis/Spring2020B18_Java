package OfficeHours.Practice_04_22_2020;

public class void_Method {

    public static void main(String[] args) {

        print();

        System.out.println("==========================");

       boolean USCitizen=true;
       int age = 21;
       Vote(age,USCitizen);

       Vote(35,false);//ya yukariya variable vericez yada boyle direk asagi yazicaz



    }


    public static void print(){

        System.out.println("Hello Batch 18");


    }

    public static void Vote(int age, boolean USCitizen){
        boolean eligibleToVote = age >=18 && USCitizen==true;

        if (eligibleToVote){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote yet");
        }


    }


    public static void EligibleToBuCig (int age){



    }




}
