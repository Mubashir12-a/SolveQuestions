import java.util.Scanner;
import java.util.ArrayList;

public class Print_All_Prime_Upto_Range {
    public static void main(String[] args) {
        int Range = 0;
        ArrayList<Integer> PrimeNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            try{
                System.out.print("Enter The Range : ");
                Range = scanner.nextInt();

                if(Range < 1){
                    throw new IllegalArgumentException("\u001B[31m" + "Enter valid Range 1 - ∞" + "\u001B[37m");
                }

                break; 
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            } catch(Exception e){
                System.out.println("\u001B[31m" + "Enter valid Input As a Number" + "\u001B[37m");
                scanner.nextLine();
            }
        }

        scanner.close();

        if(Range > 0){
            PrimeNumbers.add(2);
        }

        for(int i = 3; PrimeNumbers.size() < Range; i += 2){
            int factors = 0;

            for(int j = 1; j < (i * i); j++){
                if(i % j == 0){
                    factors++;
                }
            }

            if(factors == 2){
                PrimeNumbers.add(i);
            }
        }

        System.out.println(PrimeNumbers);
    }
}
