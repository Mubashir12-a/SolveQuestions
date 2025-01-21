/*
 * Example:
 * Simple Interest:
 * If you invest ₹10,000 at an interest rate of 5% for 2 years:
 * Simple Interest = 10,000 × 5% × 2 = 1000
*/

/*
 * Example:
 * Compounded Interest:
 * If you invest ₹10,000 at an interest rate of 5% compounded annually for 2 years:
 * 𝐴 = 10,000 × (1 + 5/100)^1×2 = 10,000 × (1.05)^2 ≈ 11025
*/

import java.util.Scanner;

public class Interest_Calculator {
    static Scanner scanner = new Scanner(System.in);
    static Long Amt;
    static int Int_rate, TimeYear, Comp_Freq = 1;

    public static void main(String[] args) {

        TakeInput.Take_Amount_Input();
        TakeInput.Take_Interest_Input();
        TakeInput.Take_Years_Input();
        TakeInput.Take_Cmpd_Freq_Input();

        System.out.println("\n");

        Interest_Calculate interest_Calculate = new Interest_Calculate(Amt, Int_rate, TimeYear, Comp_Freq);
        interest_Calculate.Simple_Interest();
        interest_Calculate.Compounded_Interest();

    }

    public static void ErrorMessage(){
        System.out.println("Please Enter Valid Data (Your Entered Data is recognised as String)");
    }
}

class TakeInput {
    public static void Take_Amount_Input() {
        while (true) {
            try {
                System.out.print("Enter Amount : ");
                Interest_Calculator.Amt = Interest_Calculator.scanner.nextLong();

                if (Interest_Calculator.Amt < 0) {
                    throw new IllegalArgumentException("Please Enter Valid Amount");
                }

                break;
            } catch (Exception e) {
                Interest_Calculator.ErrorMessage();
                Interest_Calculator.scanner.nextLine();
            }
        }
    }

    public static void Take_Interest_Input() {
        while (true) {
            try {
                System.out.print("Enter Interest Rate (E.g :  ___ %) : ");

                Interest_Calculator.Int_rate = Interest_Calculator.scanner.nextInt();

                if (Interest_Calculator.Int_rate < 0) {
                    throw new IllegalArgumentException("Enter Valid Interest Input");
                }

                break;
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            } catch (Exception e) {
                Interest_Calculator.ErrorMessage();
            }
        }
    }

    public static void Take_Years_Input() {
        while (true) {
            try {
                System.out.print("Enter Interest Years : ");

                Interest_Calculator.TimeYear = Interest_Calculator.scanner.nextInt();

                if (Interest_Calculator.TimeYear <= 0) {
                    throw new IllegalArgumentException("Enter Valid Year Input");
                }

                break;
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            } catch (Exception e) {
                Interest_Calculator.ErrorMessage();
            }
        }
    }

    public static void Take_Cmpd_Freq_Input() {
        while (true) {
            try {
                System.out.print("Enter Compounded Frequency : ");

                Interest_Calculator.Comp_Freq = Interest_Calculator.scanner.nextInt();

                if (Interest_Calculator.TimeYear <= 0) {
                    throw new IllegalArgumentException("Enter Valid Compound Frequency Input");
                }

                break;
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            } catch (Exception e) {
                Interest_Calculator.ErrorMessage();
            }
        }
    }

}

class Interest_Calculate {
    public Long Amount;
    public int Rate;
    public int Years;
    public int Compound_Frequency;

    Interest_Calculate(long amount, int rate, int years, int compound_Frequency) {
        Amount = amount;
        Rate = rate;
        Years = years;
        Compound_Frequency = compound_Frequency;
    }

    public void Simple_Interest() {
        Long Simple_Interest = (long) (Amount * ((double) Rate / 100) * Years);
        System.out.println("The Simple Interest For ₹" + Amount + " With Interest-Rate of " + Rate + "% For " + Years + " Years is : " + Simple_Interest);
    }

    public void Compounded_Interest() {
        double rateDecimal = (double) Rate / 100;
        double PoweredCalculation = Math.pow((1 + rateDecimal / Compound_Frequency), Compound_Frequency * Years);
        double Compounded_Interest = Amount * PoweredCalculation;
        Compounded_Interest -= Amount;

        System.out.println("The Compound Interest For ₹" + Amount + " With Interest-Rate of " + Rate + "% For " + Years + " Years and Compound frequency " + Compound_Frequency + " is : " + Compounded_Interest);

    }
}

