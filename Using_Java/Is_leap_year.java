/*
 * The 100 and 400 rule ensures the leap year system aligns closely with the Earth's orbit around the Sun, which takes about 365.2422 days. Here's why:

 * 365 days vs. actual year length

 * A normal year has 365 days, but the Earth takes about 365.2422 days to complete an orbit.
 * To compensate for the extra 0.2422 days (~6 hours), a leap year adds 1 day every 4 years (0.2422 × 4 ≈ 1).
 * Overcompensation by leap years

 * Adding a leap year every 4 years slightly overcompensates because 0.2422 × 4 = 0.9688, not a full day.
 * Over 100 years, this adds about 0.03 extra days per year × 100 = 3 extra days.
 * To correct this, years divisible by 100 are not leap years.
 * Exception for divisibility by 400

 * Skipping all century years would overcorrect.
 * To fix this, century years divisible by 400 remain leap years.
 */

import java.util.Scanner;

public class Is_leap_year {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        DoThis:
        while(true){
            try{
                int year;
                System.out.print("Enter The Year : ");
                year = scanner.nextInt();

                if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
                    System.out.println("Its a Leap Year : " + year);
                }
                else{
                    System.out.println("its not a Leap Year : " + year);
                }

                break;
                
            } catch(Exception e){
                System.out.println("Invalid Input");
                scanner.nextLine();
                continue DoThis;
            }
        }

        scanner.close();
    }
}
