package HackerEarth;

import java.util.Scanner;

public class SumOfN {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

       // int num = sc1.nextInt();
        int N= sc1.nextInt();

        // Define an array of integers of size N.
        int[] numArray = new int[N];


        int sum = 0;
        for(int i=0; i<N; i++){
            numArray[i] = sc1.nextInt(); // Get the input
        }

        // write the logic to add these numbers here:
        for(int i=0;i<N;i++)
             sum=sum+i;


            // Print the sum
            System.out.print(sum);
        sc1.close();
    }

}
