import java.util.Scanner;

public class Large_In_3_Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int arr [] = new int[3];

        DoThis:
        while(true){
            try {

                System.out.println("Enter 3 Numbers : \n");

                for(int i = 0; i < 3; i++){
                    System.out.printf("Num-%d : ", i+1);
                    arr[i] = scanner.nextInt();
                }

                break;

            } catch(Exception e){
                System.out.println("\nInvalid Input \nTry Again\n\n\n");
                scanner.nextLine();
                continue DoThis;
            }
        }

        int large = arr[0];


        for(int i = 0; i < arr.length; i++){
            if(arr[i] > large){
                large = arr[i];
            }
        }

        System.out.println("\nThe Large Number Between Those are : " + large);

    }
}
