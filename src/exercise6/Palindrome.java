package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.print ("Eingeben Sie eine Zahl: ");

       int number = input.nextInt();
       assert number >0;

       int number2 = 0;
       int number3 = number;

       while (number3 > 0){
         number2 = (number2*10) + (number3 % 10);
         number3 /= 10;
       }

       boolean palindrome = number == number2;
       System.out.println("Palindrome: " + palindrome);

    }
}
