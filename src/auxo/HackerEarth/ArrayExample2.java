package auxo.HackerEarth;

import java.util.Scanner;

public class ArrayExample2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInteger = getInteger(5);
        int[] sortArray=sortIntegers(myInteger);
        printArray(sortArray);
    }

    public static int[] getInteger(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter" + capacity + " integer values");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println("Element "+i +"contents"+array[i]);
        }
    }
    public  static int[] sortIntegers(int[]array)
    {
        int[] sortArray=new int[array.length];
        for (int i=0;i<array.length;i++)
        {
            sortArray[i]=array[i];
        }
        boolean flag=true;
        int temp ;
        while (flag)
        {
            flag=false;
            for(int i=0;i<sortArray.length-1;i++)
            {                                                     //a[i+1]=b
                if(sortArray[i]<sortArray[i+1]){   //a[i]<a[i+1]) //a<b
                    temp=sortArray[i];             //temp=a[i] //temp=a
                    sortArray[i]=sortArray[i+1];   //a[i]=a[i+1]//a=b
                    sortArray[i+1]=temp;          //a[i+1]=temp//b=temp
                    flag=true;
                }
            }
        }
        return sortArray;
    }
}

