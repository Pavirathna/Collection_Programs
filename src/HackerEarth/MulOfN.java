package HackerEarth;

import java.util.Scanner;

public class MulOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter input to check multiply upto N");
        int input=sc.nextInt();
        int a[]=new int[input];
        int result=0;
        for(int i=0;i<input;i++)
        {
            result*=a[i];
            System.out.println (input);
        }
        System.out.println ("**"+result);
    }
}
