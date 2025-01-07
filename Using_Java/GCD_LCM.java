import java.util.ArrayList;
import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Num_1 = 0, Num_2 = 0;

        try{
            System.out.print("Enter Num-1 : ");
            Num_1 = scanner.nextInt();

            System.out.print("Enter Num-2 : ");
            Num_2 = scanner.nextInt();
        } catch(Exception e){
            System.out.println("Invalid Input");
        }

        scanner.close();

        GDC_LCM obj = new GDC_LCM();
        obj.GetGDC(Num_1, Num_2);
        obj.GetLCM(Num_1, Num_2);

    }
}



class GDC_LCM {
    public void GetGDC(int a, int b) {
        // GDC = Greatest Common Divisor:

        int max = 0, GCD = 0;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        for (int i = 1; i <= max; i++) {
            if (a % i == 0 && b % i == 0) {
                GCD = i;
            }
        }

        System.out.println("\u001B[32m" + "GCD of Given Two Number's is : " + "\u001B[31m"  + GCD + "\u001B[37m");
    }

    public void GetLCM(int a, int b) {
        // LCM = Least Common Multiple :

        ArrayList<Integer> arr_1 = new ArrayList<>();
        ArrayList<Integer> arr_2 = new ArrayList<>();

        int j = 2;

        while (j <= a || j <= b) {
            boolean Divisible = false;

            // For Num_1;

            if (a % j == 0) {
                a = a / j;
                arr_1.add(j);
                Divisible = true;
            }

            // For Num_2;

            if (b % j == 0) {
                b = b / j;
                arr_2.add(j);
                Divisible = true;
            }

            if (!Divisible) {
                j++;
            }
        }

        // System.out.println(arr_1);
        // System.out.println(arr_2);

        int MinSize = 0;

        if (arr_1.size() > arr_2.size()) {
            MinSize = arr_2.size();
        } else {
            MinSize = arr_1.size();
        }

        // System.out.println(MinSize);

        ArrayList<Integer> Factors = new ArrayList<>();

        for (int i = 0; i < MinSize; i++) {
            if (arr_1.get(i) != arr_2.get(i)) {
                Factors.add(arr_1.get(i));
            }
        }
        Factors.addAll(arr_2);

        // System.out.println(Factors);

        int LCM = 1;

        for (int i = 0; i < Factors.size(); i++) {
            LCM *= Factors.get(i);
        }

        System.out.println("\u001B[32m" + "LCM of Given Two Number's is : " + "\u001B[31m" + LCM + "\u001B[37m");
    }
}
