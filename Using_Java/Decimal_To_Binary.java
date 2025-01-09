import java.util.ArrayList;
import java.util.Scanner;

// Note 0 & 1 Dicimal Number Binaray is also 0 and 1;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        while(true){
            try{
                System.out.print("Enter Any Decimal Number : ");
                num = scanner.nextInt();
    
                if(num < 0){
                    throw new IllegalArgumentException("Number Must be Positive");
                }

                break;
    
            } catch(IllegalArgumentException e){
    
                System.out.println(e.getMessage());
                scanner.nextLine();
    
            } catch(Exception e){
    
                System.out.println("Invalid Input By User!");
                scanner.nextLine();
            }
        }
            
        scanner.close();
        

        int OutPut = num;

        ArrayList<Integer> Arr = new ArrayList<>();

        if (num == 0) {
            Arr.add(0);
        } else {
            while (num >= 1) {
                if (num % 2 == 0) {
                    // System.out.println("0");
                    Arr.add(0);
                    num = num / 2;
                } else {
                    // System.out.println("1");
                    Arr.add(1);
                    num = num - 1;
                    num = num / 2;
                }
            }
        }

        System.out.print("Given Decimal Number " + OutPut + " Binary is : ");

        for (int i = (Arr.size() - 1); i >= 0; i--) {
            System.out.print(Arr.get(i));
        }

    }
}
