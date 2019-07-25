package auxo.HackerEarth;

import java.util.Scanner;

public class SumOfNum2 {

    public static void main(String[] args) {

        Scanner s = new Scanner ( System.in );

        int num = s.nextInt ();

        // Define an array of integers of size N.
        int[] numArray = new int[num];


        int sum = 0;
        for (int i = 0; i < num; i++) {
            numArray[i] = s.nextInt (); // Get the input
        }

        // Write the logic to add these numbers here:

        for (int i = 0; i < num; i++) sum += numArray[i] * numArray[i];


        // Print the sum
        System.out.print ( sum );
        s.close ();
    }

}
