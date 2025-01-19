import java.util.ArrayList;
import java.util.Scanner;

public class Factors_Of_Num {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Factors = new ArrayList<>();

        int Num = 0;
        String Icon = "";

        while(true){
            try {
                System.out.print("Enter The Number : ");
                Num = scanner.nextInt();
            
                if(String.valueOf(Num).startsWith("-") || Num == 0 || Num == 1){
                    Num = Integer.valueOf(String.valueOf(Num).replace("-", ""));
                    Icon = "± ";
                }

                break;
            } catch (Exception e) {
                System.out.println("Invalid Input");
                scanner.nextLine();
            }
        }

        scanner.close();

        int i = 2;

        while(Num > 1){
            if(Num % i == 0){
                Factors.add(Icon + i);
                Num /= i;
            }

            if(Num % i != 0){
                i++;
            }
        }

        Factors.add(Icon + "1");

        System.out.println(Factors);
    }
}