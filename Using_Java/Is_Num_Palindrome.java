import java.util.Scanner;

/*
 * Palindrome Number: 
 * A number that reads the same backward as forward.
 * Examples:
 * 121   <-- Backward --> 121
 * 12321 <-- Backward --> 12321
 * Leading zeros are generally ignored in integers, 
 * so 01210 is treated as 1210, which is not a palindrome.
 */

public class Is_Num_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int num;
        String Given;

        while(true){
            try{
                System.out.print("Enter The Number : ");
                Given = scanner.nextLine();
                num = Integer.parseInt(Given);

                if(num < 0){
                    throw new IllegalArgumentException("Number Should be Positive");
                }

                break;
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            } catch(Exception e){
                System.out.println("Invalid Input Number Should Be Positive.\n");
            }
        }

        scanner.close();

        if(Given.startsWith("0")){
            System.out.println("\u001B[33m" + Given + "\u001B[31m" + " Is Not Palindrome Because its Reverse is " + "\u001B[33m" + Is_Num_Palindrome.GivePalindrome(num) + "\u001B[37m");
            System.out.println("\u001B[35m" + "Note : Leading Zeroes are removed due to the nature of integers stripping leading zeros." + "\u001B[37m");
        }

        else if(num != Is_Num_Palindrome.GivePalindrome(num)){
            System.out.println("\u001B[33m" + Given + "\u001B[31m" + " Is Not Palindrome Because its Reverse is " + "\u001B[33m" + Is_Num_Palindrome.GivePalindrome(num) + "\u001B[37m");
        } else{
            System.out.println("\u001B[33m" + Given + "\u001B[32m" + " Is Palindrome Because its Reverse is " + "\u001B[33m" + Is_Num_Palindrome.GivePalindrome(num) + "\u001B[37m");
        }
    }

    private static int GivePalindrome(int num){
        int PalindromeNum = 0;

        while(num > 0){
            PalindromeNum *= 10;
            PalindromeNum = PalindromeNum + (num % 10);
            num /= 10;
        }

        return PalindromeNum;
    }
}
