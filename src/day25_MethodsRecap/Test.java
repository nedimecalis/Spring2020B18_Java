package day25_MethodsRecap;

import Resources.Library;


public class Test {

    public static void main(String[] args) {

        String str = "ABCABCABCABCABC";
        String result = Library.RemoveDuplicates(str);
//neden stringe assign ediyoruz cunlu souta yazicaz
        System.out.println(result);


        String str1 = "ABBAABBAABA";
        String str2 = "B";


       int num1 = Library.Frequency(str1,str2);
        //return type of Frequency int o yuzden int variabla yapiyoruz once
        System.out.println(num1);


        String str3 = "MMMMMNNNDJJSHSHHHH";
        String result3 = Library.FrequencyOfChars(str3);
        System.out.println(result3);






    }




}
