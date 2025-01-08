// import java.util.ArrayList;
// import java.util.Scanner;

// // Note 0 & 1 Dicimal Number Binaray is also 0 and 1;

// public class Decimal_To_Binary {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter Any Decimal Number : ");
//         int num = scanner.nextInt();

//         scanner.close();

//         int OutPut = num;
//         int r = 0;

//         ArrayList<Integer> Arr = new ArrayList<>();

//         while (num > 1) {
//             if (num % 2 == 0) {
//                 Arr.add(0);
//                 num /= 2;
//                 System.out.println("0");
//             }

//             if (num % 2 != 0) {
//                 Arr.add(1);
//                 r = num % 2;
//                 num -= r;
//                 if(num > 1){
//                     num /= num;
//                 }
//                 else{
//                     num = 0;
//                 }
//                 System.out.println("1");
//             }
//         }

//         System.out.print("Given Decimal Number " + OutPut + " Binary is : ");

//         for(int i = (Arr.size() - 1); i >= 0; i--){
//             System.out.print(Arr.get(i) + " ");
//         }

//     }
// }
