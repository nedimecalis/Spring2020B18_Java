package OfficeHours.Practice_04_08_2020;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class WhileLoop_Max_Min {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        byte max = -127;//byte'in aldigi en kucuk numara max bundan buyuk olmali
        byte min = 127;//byte'in aldigi en buyuk nuara min bundan kucuk olmali

        int count = 1;
        while(count<=3){
            System.out.println("Enter a number: ");
            byte num = input.nextByte();

            if(num>max){
                //System.out.println(num + "is max number");
                //7is max number
                //7is min number
                //Enter a number:
                //num=max; yazarsak --> maximum number is;-127

                max=num;

            }
            if(num<min){
                //System.out.println(num + "is min number");
                //7is max number
                //7is min number
                //Enter a number:
                //num=min; yazarsak --> minimum number is; 127

                min=num;
            }

            count++;//once conditionlara bakacak sonra tekrar enter diye soracak

            //System.out.println(num);buraya yazinca sadece Enter a number: yazdigin numara uc defa cikiyo

        }

        System.out.println("maximum number is; "+max);
        System.out.println("minimum number is; "+min);


        System.out.println("=========================================");

        int kere = 1;
        byte maks = -127;
        byte mini = 127;

        for(kere=1; kere <=3; kere++){
            System.out.println("bir sayi girin: ");
            byte sayi = input.nextByte();

            if(sayi>maks){
                maks=sayi;
            }
            if(sayi<mini){
                mini=sayi;
            }

        }
        System.out.println("en buyuk sayi: "+maks);
        System.out.println("en kucuk sayi: "+mini);









    }
}
