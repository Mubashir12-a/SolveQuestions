import java.util.Scanner;

public class Count_Num_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String InputData = "";
        int flag = 0;

        while(true){
            try{
                System.out.print("Enter The Number : ");
                InputData = scanner.nextLine();
                
                if(InputData.charAt(0) == '-'){
                    flag = 1;
                } else{
                    flag = 0;
                }

                for(int i = flag; i < InputData.length(); i++){
                    if(!Character.isDigit(InputData.charAt(i))){
                        throw new IllegalArgumentException("Invalid Input");
                    }
                }
    
                break;
    
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        scanner.close();

        //System.out.println(InputData);

        if(flag == 1){
            System.out.println("Total Digits In a Number are : " + (InputData.length() - 1));
        } else{
            System.out.println("Total Digits In a Number are : " + InputData.length());
        }
    }
}
