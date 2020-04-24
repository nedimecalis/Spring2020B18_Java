package day25_MethodsRecap;

import Resources.Library;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AABBCC";//A2B2C2--harfler kacar taneyse yazicak

        String NonDup = Library.RemoveDuplicates(str);

        String result = "";

        for(int i=0; i< NonDup.length();i++){
            String ch = ""+NonDup.charAt(i);
            int num = Library.Frequency(str,ch);

          //  System.out.println(ch+num);//metod yaziyoruz bu yizden souta gerek yok
            result+=ch+num;// her seferinde harf ve frequency yazilacak

        }


      //  char ch = NonDup.charAt(0);

    }

    public static String FrequencyOfChars(String str){

        String NonDup = Library.RemoveDuplicates(str);

        String result = ""; //contains frequency of chars

        for(int i=0; i< NonDup.length();i++){
            String ch = ""+NonDup.charAt(i);
            int num = Library.Frequency(str,ch);

            //  System.out.println(ch+num);//metod yaziyoruz bu yizden souta gerek yok
            result+=ch+num;// her seferinde harf ve frequency yazilacak

        }

        return result;

    }





}
