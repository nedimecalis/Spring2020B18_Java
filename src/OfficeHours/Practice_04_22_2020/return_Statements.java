package OfficeHours.Practice_04_22_2020;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class return_Statements  {


   /*
    public static void main(String[] args) {



        method1();

        System.out.println("Hello Batch18");
    }

    public static void method1(){ //

        if (10>9){
            return;// exit the metod, sadce metottann cikarir
            // System.exit(0);//entire programi kapatir burda ve loopta kullanabiliriz, bunu heryerde kullanabiliri
            // break;//bu sadece loopta kullanilir
            //continue;// sadece loopta kullanilir
 // eger metodtype void varsa return sadce exit the metod icin yoksa hic bir sekilde kullanilmaz
   //ama eger void yerine datatype yazsaydik return metodu yukarda main metodla kullanabilirik

            System.out.println("Hello Cybertek");


        }
    }

    */


    public static void main(String[] args) {
    /*
        if(10>9){
            return;
        }
     */

        method1();

        System.out.println("Hello Batch 18");


    }


    public static void method1(){

        if(10>9){
             return;
             //System.exit(0);

        }

        System.out.println("Hello Cybertek");

    }


    public static void method2(){
        return;  // exits only
    }

    public static int method3(){
        return 123; // exits after returning the value
    }

}
