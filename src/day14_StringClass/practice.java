package day14_StringClass;

public class practice {

    public static void main(String[] args) {
        String gmail = "cybertekschool@gmail.com";

        String userinputGmail = "CybertekSchool@gmail.com";

        boolean result =  gmail.equalsIgnoreCase( userinputGmail );  // true

        if(result){
            System.out.println("Logged in");
        }

        System.out.println("==========================");


         /*
        every single gmail address ends with @gmail.com
         */

        String email = "CybertekSchool@Yahoo.com";

        if(email.endsWith("@gmail.com")){
            System.out.println("valid Gmail");
        }else{
            System.out.println("Invalid gmail");
        }









    }


}