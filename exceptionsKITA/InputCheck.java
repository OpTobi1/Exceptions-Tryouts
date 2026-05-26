package exceptionsKITA;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputCheck {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");

        try{
            int num = scanner.nextInt();
            int digit1 = Math.abs(num % 10);
            System.out.println("The units digit is: " + digit1);
        } catch (InputMismatchException e){
            System.out.println("Exception: " + e);
            System.out.println("Invalid input please try again" );
        }

    }
}
