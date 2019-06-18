package Practice_Programs;

import java.util.Scanner;

public class StringProblem {
   private static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the String :");
        String s=sc.next();
        StringRearrange(s);

    }
    public static void StringRearrange(String s)
    {
        char[]ss=s.toCharArray();
        String ReverseString="";
        int lenghtOfString=ss.length-1;
        int j=2;
        int k=j-1;
        for(int i=lenghtOfString;i>=0;i--)
        {
            ReverseString+=  ss[i];
        }
      //  int j=2;
        if(ReverseString.equals(s))
        {
            System.out.println("Its not possible to rearrange");
        }
        else {
            System.out.println("Its possible to rearrange");
            /*for(int jj=0;jj<lenghtOfString*lenghtOfString-1;jj++)
            {
            for (int i = 0; i < lenghtOfString; i += j) {
               // int d=s.charAt(i);
                char c = ss[i];
                ss[i] = ss[i + (j - 1)];
                ss[i + (j - 1)] = c;
            }
            System.out.println(ss);
            j++;*/
        }

        }
    }
}
