package OfficeHours.Practice_04_08_2020;

public class WhileLoops_Practice {
    public static void main(String[] args) {

        for(int i = 0; i<5;i ++){
            System.out.println("Hello World");
        }

        int z = 0;
        while(z<5){
            //z++;// souttan once yada sonra vermek farketmez
            System.out.println("Hello Cybertek");
            z++;
        }

        int a = 0;
        while(a<5){
            //a++; // 1,2,3,4,5 yazilacak. cunku once degerini artiracak sonra print edecek. ama her sekilde 5 element print olacak
            System.out.println(a);
            a++; // 0,1,2,3,4 yazilacak. cunku once yazacak sonra artiracak ama her sekilde 5 element print olacak
            //logical error almamak icin place a++ at the end
        }


        System.out.println("===========================================");

        int num = 0;

        for(num=0;num<=100;num++){
            if(num%15==0){
                System.out.print(" "+num);
            }
        }

        int n = 0;
        while(n<=100){
            //n++;// 0 15 30 45 60 75 90 15 30 45 60 75 90. eger sout if bodynin icinde olursa
            //System.out.print(" "+n);// 0 15 30 45 60 75 90 1 2 3 4 5 ...100'e kadar
            if(n%15==0){
                //n++;// 0 15 30 45 60 75 90 1. eger sout if bodynin icinde olursa
                System.out.print(" "+n);
            }
            n++;
            //n++;//eger if den sonra n++ yazip if bodynin disina sout yazarsak -->0 15 30 45 60 75 90 1 2 3 4 5 ...100'e kadar
            //System.out.print(" "+n);
            //eger if den once n++ yazip if bodynin disina sout yazarsak -->0 15 30 45 60 75 90 1 2 3 4 5 ...100'e kadar
        }

        System.out.println();

        int even = 0;
        while(even<=100){
            if(even%2==0){
                System.out.print(even+" ");
            }
            even++;
        }





    }

}
