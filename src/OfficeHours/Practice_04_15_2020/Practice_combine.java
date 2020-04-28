package OfficeHours.Practice_04_15_2020;

public class Practice_combine {

    public static void main(String[] args) {


        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6,7};

        int [] arr3 = new int [arr1.length+arr2.length];

        for(int i = 0; i<arr1.length; i++){
            //arr1[i]=arr3[i]; //0 0 0 0 0 0 0
            arr3[i]=arr1[i]; // 1 2 3 0 0 0 arr3 once yaziyoruzki ona eklensin
        }
       for(int i =0 ; i< arr2.length; i++){
           arr3[arr1.length+i]=arr2[i];
            //once bu looptakileri ekledi sonra ayrica yukardakileri eklememiz lazim
            //yoksa direk 4 5 6 7 0 0 0
        }

        for(int i = 0; i<arr3.length; i++) {
            System.out.print(arr3[i] + " ");
            // bu loopu basa yazsaydim 7 tane "0" yazdi cunku onceden for loopla saydirmadim.
            //bu yuzden once saydiricaz bu loopu ondan en alta yaziyoruz
        }



    }


}
