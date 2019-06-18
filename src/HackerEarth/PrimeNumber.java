package HackerEarth;
/*You are given an integer N. You need to print the series of all prime numbers till N.

Input Format

The first and only line of the input contains a single integer N denoting the number till where you need to find the series of prime number.

Output Format

Print the desired output in single line separated by spaces.

Constraints

1<=N<=1000

SAMPLE INPUT
9
SAMPLE OUTPUT
2 3 5 7*/
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N value :");
        System.out.println();
        int N=sc.nextInt();
        if((N>=1)&&(N<=1000)) {
            for (int i = 2; i < N; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
        else
            System.out.println("This value is not in the range 1-1000");


    }

    public static boolean isPrime(int number)
    {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
