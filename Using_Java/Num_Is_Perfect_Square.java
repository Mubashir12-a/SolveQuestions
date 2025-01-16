import java.util.Scanner;

/*
 * For example, if you have 4:
 * 2×2=4, which means 4 is a perfect square (true).
 * 
 * If you have 20:
 * 4.47 (not an integer), so 20 is not a perfect square (false).
 */

public class Num_Is_Perfect_Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        boolean flag = false;

        while(true){
            try{
                System.out.print("Enter The Number : ");
                num = scanner.nextInt();

                if(num < 0){
                    throw new IllegalArgumentException("Number Must Be Positive");
                }

                break;
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            } catch(Exception e){
                System.out.println("Please Enter Valid Number");
                scanner.nextLine();
            }
        }

        scanner.close();

        for(int i = 0; i <= num; i++){
            if(i * i == num){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("Yes, Given Number is Perfect Square");
        }else{
            System.out.println("No, Given Number is Not Perfect Square");
        }
    }
}
