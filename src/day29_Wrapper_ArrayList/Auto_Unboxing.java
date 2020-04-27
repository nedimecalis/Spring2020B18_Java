package day29_Wrapper_ArrayList;

public class Auto_Unboxing {

    public static void main(String[] args) {

        int a = 100; // primitive

        Integer b = a; // I can assign it to its class. compiler converts the primitive to its class automaticaly
        // Auto boxing: primitive values to wrapper class

        Byte byte1 = 98; //I can assign byte to Byte

        short short1 = byte1;// Unboxing. I can assign byte1 wrapped primitive to other primitives
        byte b2 = byte1; //Unboxing
        int int1 = byte1; //Unboxing
    }
}
