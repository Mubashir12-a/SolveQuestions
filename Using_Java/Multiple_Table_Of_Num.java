import java.util.Scanner;

public class Multiple_Table_Of_Num {

    private static void Table(int n, int range){
        for(int i = 1; i <= range; i++){
            System.out.println("\u001B[32m" + n + " x " + i + " = " + "\u001B[34m" + (n * i) + "\u001B[37m");
        }
    }
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       int num = 0, range = 0;

       while(true){
        try{
            System.out.print("Enter The Number : ");
            num = scanner.nextInt();
            
            if(num <= 0){
                throw new IllegalArgumentException("Error : Enter Positve Number.");
            }

            System.out.print("Enter The Range : ");
            range = scanner.nextInt();

            if(range <= 0){
                System.out.println("Wrong Range Input By Default It's Set to 10.");
                range = 10;
            }

            
            break;
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("Invalid Input");
            scanner.nextLine();
        } 
    
       }

       scanner.close();

       Multiple_Table_Of_Num.Table(num, range);
    }
}