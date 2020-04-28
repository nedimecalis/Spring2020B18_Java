package OfficeHours.Practice_04_08_2020;

public class ForLoop_Task {

    public static void main(String[] args) {

        //int i=0; istersem en basa int yazar loopa int yazmazdim ama bu sefer loopin disini da etkiler
        for(int i=0; i<=100;i++){
            if(i%3==0||i%5==0){
                System.out.print(i+" ");
            }
            //System.out.println(); bunu buraya yazarsam altalta sadece 3 ve 5 le bolunenleri yazar ama aralarina birer bosluk birakir
            //System.out.print(i+"");//eger sout if'in disina yazarsam bana butun 1-100 sayilari verecek
        }
        //System.out.println(i);// yazamam cunku loopin disina ciktim i'yi tanimaz
        //eger en basta int i=0 gibi variable verseydim o zaman butun sayilardan sonra 101 yazacakti cunku yukrada artirdi sonra yazdi

        System.out.println();
        System.out.println("================================================");
        //            123456 --name.length() her zaman kac adet character oldugunu yazar yani burda 6
        // length metod her zaman bana sayi ile dondugu icin int varaible veririz

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

            result += name.charAt(i);
            //bu sekilde her zaman kullanmak icin reusable yaptim

            //name+=name.charAt(i); yazinca butun sonuclari name'e eklicek

            // System.out.println(name);loopun icine yazinca once ismin kendisini sonra teker teker tersten yazmaya basliyo
            /*
                Nedimee
                Nedimeem
                Nedimeemi
                Nedimeemid
                Nedimeemide
                NedimeemideN
             */

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

        //System.out.println(result);
        //System.out.println(name);
        //name+=name.chartAt(i)yazip loopun disina (name) yazarsam -->NedimeemideN

       //System.out.println(result);//loopun disina sadece result yazarsam hicbisey cikmaz



    }


}
