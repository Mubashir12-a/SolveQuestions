import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Num = "";
        

        while(true){
            try {
                System.out.print("Enter The Number : ");
                Num = scanner.nextLine();

                if(Num.charAt(0) == '-'){
                    throw new IllegalArgumentException("\u001B[31m" + "Number Should be positive\n" + "\u001B[37m");
                }

                for(int i = 0; i < Num.length(); i++){
                    if(!Character.isDigit(Num.charAt(i))){
                        throw new IllegalArgumentException("Invalid Input Please Enter the Number.");
                    }
                }
                
                break;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } 
        }
        
        scanner.close();

        String Reverse = "";

        //System.out.println(Num.length());

        for(int i = 0; i < Num.length(); i++){
                Reverse = Reverse + Num.charAt((Num.length() - 1) - i);
        }

        System.out.println("\u001B[32m" + "Reverse Of Number Is : " + "\u001B[34m" + Reverse + "\u001B[37m");

    }
}
