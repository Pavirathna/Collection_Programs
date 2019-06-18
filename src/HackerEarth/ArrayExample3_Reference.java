package HackerEarth;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample3_Reference {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int myIntValue=10;
        int anotherValue=myIntValue;
        System.out.println("myIntValue ="+ myIntValue);
        System.out.println("Another Value ="+anotherValue);
        anotherValue++;
        System.out.println("Another Value ="+anotherValue);
        int[] myIntArray=new int[5];
        int[] anotherArray=myIntArray;
        System.out.println("myIntValue = "+ Arrays.toString(myIntArray));
        System.out.println("another value = "+Arrays.toString(anotherArray));
        anotherArray[0]=1;
        System.out.println("After myIntValue = "+ Arrays.toString(myIntArray));
        System.out.println("After another value = "+Arrays.toString(anotherArray));
        modifyArray(myIntArray);
        additionArray(anotherArray);
        System.out.println("Enter 5 values ");
        for(int i=0;i<5;i++)
        {
            anotherArray[i]=sc.nextInt();
        }
        System.out.println("After myIntValue = "+ Arrays.toString(myIntArray));
        System.out.println("After another value = "+Arrays.toString(anotherArray));
        //System.out.println("Sorting array : "+additionArray(anotherArray));
        int[] array2=additionArray(anotherArray);
        System.out.println("Sorting Integer :"+Arrays.toString(array2));
    printArray(array2);
    }
    private static void modifyArray(int []array)
    {
        array[0]=2;
    }
    public static void printArray(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println("Element "+i +"contents"+array[i]);
        }
    }
    private  static int[] additionArray(int []array)
    {

        boolean flag=true;
        int temp ;
        while (flag)
        {
            flag=false;
            for(int i=0;i<array.length-1;i++)
            {                                                     //a[i+1]=b
                if(array[i]<array[i+1]){   //a[i]<a[i+1]) //a<b
                    temp=array[i];             //temp=a[i] //temp=a
                    array[i]=array[i+1];   //a[i]=a[i+1]//a=b
                    array[i+1]=temp;          //a[i+1]=temp//b=temp
                    flag=true;
                }
            }
        }
        return array;
    }
}
