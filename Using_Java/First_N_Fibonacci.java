//package Using_Java;

import java.util.Scanner;


public class First_N_Fibonacci {
    public static void main(String[] args) {
        // 0 + 1 = 1
        //     1 + 1 = 2
        //         1 + 2 = 3
        //             2 + 3 = 5
        //                 3 + 5 = 8 ...so-on

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The  Range : ");
        int First_N_fibbo = scanner.nextInt();

        scanner.close();
    
        int [] arr = new int[First_N_fibbo];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i < First_N_fibbo; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
