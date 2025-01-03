import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        // Num = 458;
        // Sum = 4 + 5 + 8 = 17;

        Scanner scanner = new Scanner(System.in);

        InputLoop :
        while(true){
            try{
                System.out.print("Enter The Number : ");
                int Num = scanner.nextInt();

                int sum = 0, r;

                while(Num != 0){
                    r = Num % 10;
                    sum = sum + r;
                    Num = Num / 10;
    
                    // System.out.println(sum + "--" + Num + "--" + r); ----> To Check
                }
                System.out.println("The Sum Of Given Number Digits : " + sum);

                break;
            } catch(Exception e){
                System.out.println("\u001B[31m" + "Invalid Input Data-Type \n" + e + "\u001B[37m" );
                scanner.nextLine();
                continue InputLoop;
            } 
        }

        scanner.close();
    }
}
