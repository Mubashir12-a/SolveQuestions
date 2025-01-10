import java.util.ArrayList;
import java.util.Scanner;

public class If_Armstrong_Num {
    static int PowerResult(int n, int len){
        int result = 1;
    
        for(int i = 0; i < len; i++){
            result = result * n;
        };
    
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        while(true){
            try{
                System.out.print("Enter Number : ");
                num = scanner.nextInt();

                if(num <= 0){
                    throw new IllegalArgumentException("Invalid Input Please Enter Positive Number.");
                }

                break;
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                scanner.nextLine();
            } catch(Exception e){
                System.out.println("Input Must be Number.");
                scanner.nextLine();
            } 
        }

        scanner.close();
    
        int r = 0;
        int sum = 0;
        int CprNum = num;

        ArrayList<Integer> arr = new ArrayList<>();

        while(num > 0){
            r = num % 10;
            arr.add(r);
            num = num / 10;
        }

        //System.out.println(arr.size());
        
        for(int i = 0; i < arr.size(); i++){
            arr.set(i, If_Armstrong_Num.PowerResult(arr.get(i), arr.size()));
            //System.out.println(arr.get(i));
            sum = sum + arr.get(i);
        }

        //System.out.println(sum);

        if(sum == CprNum){
            System.out.println("Given Number is ArmStrong. After Calculation = " + sum );
        } else {
            System.out.println("Given Number is not Armstrong. After Calculation = " + sum);
        }
        
    }

}
