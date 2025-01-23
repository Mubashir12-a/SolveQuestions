/*
 * Normal And Simple Way To Convert Character into ANCII value.
 */

import java.util.Scanner;

public class Find_The_ANCII_Val_Char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Character : ");
        char Character = scanner.next().charAt(0);
        scanner.close();

        System.out.println("ANCII Value of " + Character + " : " + Integer.valueOf(Character));
    }
}
