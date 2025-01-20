import java.util.Scanner;

public class Find_The_Power_Num {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Num = 0, Power = 0;
        String Input, Vals [];

        while(true){
            try{
                System.out.print(Colors.C + "\nEnter The Number And Power Seprate By Comma (Like : Num, Power) = ");
                Input = scanner.nextLine();

                Input = Input.replace(" ", "");
                Vals = Input.split(",");

                if(Vals.length != 2){
                    throw new IllegalArgumentException(Colors.R + "Please Follow The Given Format" + Colors.W);
                }

                Num = Integer.valueOf(Vals[0]);
                Power = Integer.valueOf(Vals[1]);

                if(Num < 0 || Power < 0){
                    throw new IllegalArgumentException(Colors.R + "Number Should be Positive" + Colors.W);
                }

                System.out.println(Colors.M + "Your Given Data Is : "+ Colors.C + "Number --> " + Num + ", Power --> " + Power + Colors.W + "\n");
                System.out.print(Colors.B + "Confirm Your Data Y/y Or N/n : ");
                char confirmation = scanner.next().charAt(0);

                if(confirmation == 'Y' || confirmation == 'y'){
                    break;
                }

                System.out.println(Colors.R + "Please Follow The Given Format" + Colors.W);
                scanner.nextLine();
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        scanner.close();

        int Ans = Num;

        for(int i = 1; i < Power; i++){
            Ans = Ans * Num;
        }

        if(Power == 0){
            Ans = 1;
        }

        System.out.println(Colors.G + "Calculated Result of " + Colors.B + Num + Colors.G + " Power Of " + Colors.B + Power + Colors.G + " = " + Colors.C + Ans + Colors.W);
    }
}

class Colors {
    final public static String R = "\u001B[31m";
    final public static String G = "\u001B[32m";
    final public static String Y = "\u001B[33m";
    final public static String B = "\u001B[34m";
    final public static String M = "\u001B[35m";
    final public static String C = "\u001B[36m";
    final public static String W = "\u001B[37m";
}
