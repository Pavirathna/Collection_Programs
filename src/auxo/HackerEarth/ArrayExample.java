package auxo.HackerEarth;

import java.util.Scanner;

public class ArrayExample {
  /* public static void main(String[] args) {

       /* myVariable[0]=10;
        myVariable[1]=20;
        myVariable[2]=30;
        myVariable[5]=50;*/
      /* int[] myIntArray = new int[15];//{1,2,3,4,5};

       for (int i = 0; i < myIntArray.length; i++) {
           myIntArray[i] = i * 10;
       }

       printArray(myIntArray);
   }

       public static void printArray (int[] array)
       {
           for (int i = 0; i < array.length; i++) {
               System.out.println("Element" + i + " ,value is" + array[i]);
           }

       }*/
  private static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

           int[] myIntegers=getIntegers(5);
           for(int i=0;i<myIntegers.length;i++)
           {
               System.out.println("Element "+i+" , type values was "+myIntegers[i]);
           }
        System.out.println("average is "+getAverage(myIntegers));
        }
  public static int[] getIntegers(int number)
        {
            System.out.println("Enter"+ number+ " integer values.\r");
            int[] values=new int[number];
            for(int i=0;i<values.length;i++)
            {
                values[i]=sc.nextInt();
            }
            return values;
        }

        public static double getAverage(int[] array)
        {
            int sum=0;
            for(int i=0;i<array.length;i++)
            {
                sum+=array[i];
            }
            return(double) sum/(double)array.length;
        }

    }


