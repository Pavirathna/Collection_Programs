package HackerEarth;
/*Add two arrays
Write a program to add the corresponding elements of two arrays, each of size N and print the sums. N can be any integer between 1 and 100.

Instructions:

We have defined an integer variable N for you.
We have provided the code to get the input for variable N.
We have defined integer arrays ,  and .
We have provided the code to get the input for the array elements.
You have to write the logic to add the array elements.
Store the sum values in respective elements of variable
Print all the elements of  with space between them
Sample Input:
N = 3
 = 3 9 8
 = 8 12 74

Sample Output:
11 21 82*/

import java.util.Scanner;

public class AddTwoArray {

    public static void main(String[] args) {

        Scanner s = new Scanner ( System.in );

        // Reading integer from input
        System.out.println ( "Enter Numbers in array :" );
        int num = s.nextInt ();

        int[] numArrayA = new int[num];
        int[] numArrayB = new int[num];
        int[] sumArray = new int[num];

        // Read numArray1
        System.out.println ( "enter 1st array value :" );
        for (int i = 0; i < num; i++) {
            numArrayA[i] = s.nextInt ();
        }
        // Read numArray2
        System.out.println ( "enter 2nd array value :" );
        for (int i = 0; i < num; i++) {
            numArrayB[i] = s.nextInt ();
        }

        // Write your logic here:

		/*for(int i=0;i<N,i++)

		    for(int j=0;j<N;j++)

		        for(int k=0;k<N;k++)

		            sumArray[k]=numArrayA[i]+numArrayB[j];*/


        for (int i = 0; i < num; i++)
            sumArray[i] = numArrayA[i] + numArrayB[i];

        // Print the sumArray
        for (int i = 0; i < num; i++) {
            System.out.print ( sumArray[i] + " " );
        }
        System.out.println ();
        s.close ();
    }

}