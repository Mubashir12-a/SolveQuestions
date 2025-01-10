//package Using_Java;

import java.util.*;

public class Is_Num_Prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Num;
        boolean FlagPrime = true;

        System.out.print("Enter The Number : ");
        Num = scanner.nextInt();

        scanner.close();

       if(Num <= 1){
            FlagPrime = false;
        }
        else if(Num % 2 == 0 && Num > 2){
            FlagPrime = false;
        }
       else {
        for (int i = 3; i <= Num / 2; i += 2) { // Check odd divisors
            if (Num % i == 0) {
                FlagPrime = false;
                break;
            }
        }
       }

       if(FlagPrime){
        System.out.println("Given Number is Prime");
       }
       else{
        System.out.println("Given Number is not prime");
       }

    }
}