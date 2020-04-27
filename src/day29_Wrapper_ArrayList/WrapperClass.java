package day29_Wrapper_ArrayList;

public class WrapperClass {

    public static void main(String[] args) {

        int a = 100;// primitive

        //Integer b = 200;// wrapper class. it is only dedicated for int I don't have to import

       Integer b = a;

       short s1 = 200;
       int n1 = s1;// between primitives they accept each otjer

        //Integer N1 = s1; // gives us compile error. because wrapper class is only loyal to its clacc
        //integer dedicated to int primitive. wrapper class only accepts their primitive

        Integer n2 = n1;

        //==============================================================

        int a1 = 20;
        float f1 = a1;// float can take int because it is larger

        //Float f2 = a1;// I cannot do that not at same class

        Integer I1 = 200;
        int a2 = I1; // primitives accepts class

        Byte B1 = 126;
        int a3 = B1; // any wraper class you can assign to primitives. but you should assign to their primitive
        // their data types are different but you can assign wrapper class to primitives
        System.out.println(a3);





















    }

}
