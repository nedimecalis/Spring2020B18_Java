package OfficeHours.Practice_04_15_2020;

public class Practice {

    public static void main(String[] args) {

        int a = 1;
        int [] arr ={100,200,300};// boyle yazamam cunku a yukardaki int'e assign edilmis
                   // 0   1   2
        System.out.println(arr[1]);

        for(int i = 0; i<=2; i++){
            //System.out.println(i);// index numberlari gosteriyo

            //System.out.println(arr);//[I@61bbe9ba
                                    //[I@61bbe9ba
                                    //[I@61bbe9ba
            //System.out.println(arr[]);// compile error. [] bi deger yazmam gerek

            System.out.println(arr[i]);
            // yukardaki sout(i) ve (arr[i]) beraber yazinca
            //0
            //100
            //1
            //200
            //2
            //300


        }

        for(int i=0; i<3; i++){
            int num = arr[i];// bu sekilde variable atayinca reusable yapiyoruz
            //array sout yazilinca direk cikmiyo variable assign edip o sekilde yazdiriyoruz
            System.out.println(num);
        }

        int j = 0;
        while(j<3){
            int num = arr[j];
            System.out.println(num);
            j++;
        }

        System.out.println("=================================================");



        String [] isimlerimiz = {"nedime","halim","selim","nurbanu","dilruba","melih"};

        //System.out.println(isimlerimiz);// boyle print ediyo [Ljava.lang.String;@61bbe9ba

        for(int k =0; k<= isimlerimiz.length-1; k++){
           String dizi = isimlerimiz[k] ;
           //isimlerimiz[k] Stringe assign etmeden yazdiramayiz
            System.out.println(dizi);
        }










    }


}
