package Practice_Programs;

import java.util.Scanner;

public class CountRepeatedCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Some Words:");
        String s=sc.next();
        PrintCountChar(s);

    }
    public static void PrintCountChar(String s)
    {
        int count=0;
        char[] check=s.toCharArray();
        for(int j=0;j<s.length();j++) {
            for (int i = 0; i < check.length; i++) {
                if (s.charAt(j) == check[i]) {
                    check[i]=' ';
                   count++;
                }
            }
            if(count>0) {
                System.out.println(s.charAt(j) + " character " + count + " Occurrences");
            }
            count=0;
        }
    }


}
