package day23_Methods;

public class Methods_WithParamters {

    public static void main(String[] args) {
        String name1 = "nedime";
        ReverseString(name1);

        System.out.println("hello");

        String name2 = "Cybertek School";
        ReverseString(name2);

    }

    public static void ReverseString(String str){

        for(int i = str.length()-1; i>=0;i--){

            System.out.print(str.charAt(i));
        }

        System.out.println();

    }



}
