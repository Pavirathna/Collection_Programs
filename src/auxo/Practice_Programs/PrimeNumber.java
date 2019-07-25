package auxo.Practice_Programs;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 27;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println ( number + " is not prime number" );
            } else {
                System.out.println ( number + " prime number" );
            }
            //System.out.println(i);
        }

    }
}
