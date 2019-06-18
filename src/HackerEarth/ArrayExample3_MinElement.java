package HackerEarth;

import java.util.Scanner;

public class ArrayExample3_MinElement {
    private static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count :");
        int count=sc.nextInt();
        sc.nextLine();
        int[] returnedArray=readInteger(count);
        int returnedMin=findMin(returnedArray);
        int returnedMax=findMax(returnedArray);
        System.out.println("min = "+returnedMin);
        System.out.println("max = "+returnedMax);

    }
    private static int[] readInteger(int count)
    {
        int [] array=new int[count];
        System.out.println("Enter Number");
        for(int i=0;i<array.length;i++)
        {
            int number=sc.nextInt();
            //sc.nextLine();
            array[i]=number;
        }
        return array;
    }
    private static int findMin(int[]array)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            int value=array[i];
            if(value<min){
                min=value;
            }
        }
        return min;
    }
    private static int findMax(int[]array)
    {
        int max=0;
        for(int i=1;i<array.length;i++)
        {
            max=array[0];
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        return max;

    }
}
