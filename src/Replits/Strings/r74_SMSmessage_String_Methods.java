package Replits.Strings;
/*
We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

Variables are already declared:

sender, phoneNumber, messageBody
- by using String methods:
retrieve related information from SMSmessage string and assign to those 3 variables.
-print each variable in separate line

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
 */

import java.util.Scanner;

public class r74_SMSmessage_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

        sender ="Sender: "+ message.substring(message.indexOf("<") + 1, message.indexOf(">"));
        phoneNumber ="Phone Number: "+ message.substring(message.indexOf("[") + 1, message.indexOf("]"));
        messageBody ="Message body: "+ message.substring(message.indexOf("{") + 1, message.indexOf("}"));

        System.out.println(sender+"\n"+phoneNumber+"\n"+messageBody);

    }
}

