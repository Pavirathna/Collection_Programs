package Collection_Programs;

import java.util.Scanner;

public class Theatre_Main {
   private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Theatre theatre=new Theatre("EVP",9,12);
       // theatre.getSeats();
        System.out.println("Enter seat number :");
        String sNum=sc.next();
        if (theatre.reserveSeat(sNum)){
            System.out.println("Please Pay");
        }else
        {
            System.out.println("Sorry ,Seat is taken");
        }
    }
}
