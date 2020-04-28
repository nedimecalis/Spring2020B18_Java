package Replits.Loops;

import java.util.Scanner;

/*
Given a string, print out true if the number of appearances of "java" anywhere
in the string is equal to the number of appearances of "python"
anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
 */
public class r97_Equals_java_python_WhileLoop_String {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String sentence = scan.nextLine();


            int countjava=1;
            int countpython=1;
            while(sentence.contains("java")||sentence.contains("python")) {
                if (sentence.contains("java")) {
                    sentence=sentence.replaceFirst("java", "");    // her defasinda tekrardan saymamasi icin kaldirmam gerekiyor
                    countjava++;
                }
                if (sentence.contains("python")) {
                    sentence= sentence.replaceFirst("python", ""); // her defasinda tekrardan saymamasi icin kaldirmam gerekiyor
                    countpython++;
                }
            }  if(countjava==countpython){
                System.out.println("true");
            }else{
                System.out.println("false");
            }


        }
    }

