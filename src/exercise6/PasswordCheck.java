package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean password = false;
        do{
          System.out.print("Eingeben Sie ein Passwort: ");
           String passwort = input.nextLine();

           if (passwort.length() >= 8 ){
             boolean letterordigit = true;
             for(int i=0; i<passwort.length(); i++){
               char nextSymbol = passwort.charAt(i);
               if (!Character.isLetterOrDigit(nextSymbol)){
                 letterordigit = false;
                 break;

               }
             }

             if (letterordigit){
               int counter = 0;
               for(int i = 0; i < passwort.length(); i++){
                 char nextSymbol = passwort.charAt(i);
                 if(Character.isDigit(nextSymbol)){
                   counter++;
                 }
               }
               if(counter >=2){
                 password = true;
               }
             }

           }

        }

        while (!password);
        System.out.println("Password valid!");

       

    }
}
