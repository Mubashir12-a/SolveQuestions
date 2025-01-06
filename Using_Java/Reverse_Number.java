import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Num = 0;
        

        while(true){
            try {
                System.out.print("Enter The Number : ");
                Num = scanner.nextInt();

                if(Num < 0){
                    throw new IllegalArgumentException("\u001B[31m" + "Number Should be positive\n" + "\u001B[37m");
                }
                
                break;

            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());
                scanner.nextLine();

            } catch (Exception e){
                
                System.out.println("\u001B[31m" + "Invalid Input!\n" + "\u001B[37m");
                scanner.nextLine();
            }
        }
        
        scanner.close();

        int Reverse = 0;

        while(Num != 0){
            Reverse *= 10;
            Reverse += Num % 10;
            Num /= 10;
        }

        System.out.println("\u001B[32m" + "Reverse Of Number Is : " + "\u001B[34m" + Reverse + "\u001B[37m");


    }
}
