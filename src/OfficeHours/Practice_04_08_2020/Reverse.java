package OfficeHours.Practice_04_08_2020;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        // length metod her zaman bana sayi ile dondugu icin int varaible veririz

        //            123456 --name.length() her zaman kac adet character oldugunu yazar yani burda 6
        String name= "Nedime";
        //            012345

        String result = "";// bu sekilde reverse version of string cikacak
        //buraya bos bir result yazdim ki asagidaki loopu reusable yapiyim
        // "" bunu yazinca resulta ne yazarsam concate edip onu string gibi yazacak
        int lastIndex = name.length()-1;

        for(int i=lastIndex;i>=0;i--){
            //lastIndex yazdim cunku reverse edicem icin sondaki indexten basladim
            // 0 yaziyoruz cunku reverse ediyoruz, neyi reverse edersek edelim ilk index 0 oldugu icin ona kadar gider
            // >= cunku en sondaki indexten baslayip en bas 0 indexine kadar inecek yani 0'dan buyuk olmasi gerek
            // i-- cunku geri gidecek index'i kucultmesi gerek
            // System.out.println(name); // name yazarsam bana isimdeki harf adedince ismi yazacak

            //charAt kullaninca o anda (i) hangi indexe denk geliyosa onu yaziyo
            //System.out.print(name.charAt(i));// bu sekilde yazarsam reusable olmaz o yuzden

            //result+=name.substring(i,i+1);//substring de kullanabilir. i en son harf, her zaman en son harfi bulmak icin index no ve +1 koymamiz geekiyo
            //                       5, 6 --> e
            //                       4, 5 --> m
            //                       3, 4 --> i
            //                       2, 3 --> d
            //                       1, 2 --> e
            //                       0, 1 --> N
            //cunku subsitringde ending index allways excluded bu yuzden i(ending index),+1 yazdik
            //peki (i) neden last index cunku loopun basinda onu lastindex olarak assign ettik



            result+=name.charAt(i);
            //result= result+name.charAt(i);//ikisi de ayni

            //bu sekilde her zaman kullanmak icin reusable yaptim

            //name+=name.charAt(i); //yazinca butun sonuclari name'e eklicek
            /*
                Nedimee
                Nedimeem
                Nedimeemi
                Nedimeemid
                Nedimeemide
                NedimeemideN
             */
           // name +=+name.charAt(i);//butun harfleri tersten yazip ascci table degerlerini verecek
            /*
            Nedime101
            Nedime101109
            Nedime101109105
            Nedime101109105100
            Nedime101109105100101
            Nedime10110910510010178
             */

            //System.out.println(name);//loopun icine yazinca once ismin kendisini sonra teker teker tersten yazmaya basliyo


            //name+=name.charAt(i);
            // System.out.println(result);
            //eger result+=name.chartAt(i)yazmadan direk sout result yazarsam isimdeki harf sayisi kadar altalta bosluk birakir

            // System.out.println(result);
            // loopun icine yazinca
            /*
            e
            em
            emi
            emid
            emide
            emideN
             */
        }

        System.out.println(result);

        //System.out.println(name);
        //name+=name.chartAt(i)yazip loopun disina (name) yazarsam -->NedimeemideN

        //System.out.println(result);//loopun disina sadece result yazarsam hicbisey cikmaz

        System.out.println("____________________________________");


        String lastname = "Calis";
        String result1 = "";//her zaman bir sonuc yazacagimiz icin hep result basa bos stringle koy
        int lastIn = lastname.length()-1;

        for(int j= lastIn; j >=0; j--){
            //result+=lastname.charAt(j);//boyle yazop souta result yazinca yukardaki resulta asagidaki resulti concate etti
            result1+=lastname.charAt(j);
        }
        System.out.println(result1);


        String halim= "Halim";
        String res2 = "";
        int lindex2 = halim.length()-1;

        for(int h = lindex2; h>=0; h--){
            res2+=halim.charAt(h);
        }

        System.out.println(res2);



        String selim = "Selim";
        String res3 = "";
        int lindex3 = selim.length()-1;

        for(int s =lindex3 ;s>=0 ;s--){
            res3+=selim.charAt(s);
        }
        System.out.println(res3);

        String nurbanu = "Nurbanu";
        String res4 = "";
        int lindex4 = nurbanu.length()-1;

        for(int n = lindex4; n>=0; n--) {
            res4 += nurbanu.charAt(n);
        }
        System.out.println(res4);

        String dilruba = "Dilruba";

        for(int d = dilruba.length()-1; d >= 0; d--) {

            System.out.print(dilruba.charAt(d));
        }
        System.out.println();

        String melih = "Melih";

        for(int m = melih.length()-1; m>=0; m--){
            System.out.print(melih.charAt(m));
        }

        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("bir isim girin");
        String isim = scan.nextLine();
        String sonuc = "";

        for(int e = isim.length()-1; e>=0; e--){
            sonuc+=isim.charAt(e);
        }
        System.out.println(sonuc);


/*
        String ali= "Ali";
        String res6 = "";
        int lin6 = ali.length()-1;

        for(int a = ali.length()-1;a>=0;a++){
            res6 += ali.substring(a,a+1);
        }
        System.out.println(res6);

 */




    }
}
