package auxo.HackerEarth;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner s = new Scanner ( System.in );

        int num1 = s.nextInt (); // Get first integer
        int num2 = s.nextInt (); // Get second integer


        int sum = num1 + num2;

        // Print the sum
        System.out.println ( sum );
        s.close ();
    }

}