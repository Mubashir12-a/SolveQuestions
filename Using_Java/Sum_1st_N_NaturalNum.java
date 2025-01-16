import java.util.Scanner;

public class Sum_1st_N_NaturalNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = 0, sum = 0;

        while(true){
            try{
                System.out.print("Enter The Nth Number : ");
                num = scanner.nextInt();

                if(num < 0){
                    throw new IllegalArgumentException("Number must be Natural Number");
                }

                break;
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println("Input Must be Number");
                scanner.nextLine();
            }
        }

        scanner.close();

        for(int i = 0; i <= num; i++){
            sum = sum + i;
        }

        System.out.println("The Sum Of First " + num + " Numbers are : " + sum);
    }
}
