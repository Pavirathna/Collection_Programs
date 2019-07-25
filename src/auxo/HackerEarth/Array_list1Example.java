package auxo.HackerEarth;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list1Example {
    static Scanner sc=new Scanner(System.in);
    private static GroceryList groceryList=new GroceryList ();
    public static void main(String[] args) {
        boolean quit=false;
        int choice=0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit=true;
                    break;

            }
        }

    }
    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0-To print choice options");
        System.out.println("\t 1-To print the list of grocery items");
        System.out.println("\t 2-To add an item to the list");
        System.out.println("\t 3-To modify an item in the List");
        System.out.println("\t 4-To remove an item in item in the list");
        System.out.println("\t 5-To quite the application");
    }
    public static  void addItem(){
        System.out.println("Please enter the grocery item");
        groceryList.addGroceryItem(sc.nextLine());
    }
    public static void modifyItem(){
        System.out.println("Enter Item number");
        int intemNo=sc.nextInt();
        sc.nextLine();
    }
    public static void removeItem(){
        System.out.println("Enter item number");
        int itemNo=sc.nextInt();
        sc.nextLine();
    }
    public static void searchItem(){
        System.out.println("Item to search for :");
        String searchItem=sc.nextLine();
        if(groceryList.findItem(searchItem)!=null){
            System.out.println("Found"+searchItem+ "in our grocery list");
        }else
        {
            System.out.println(searchItem+" is not in the shopping list");
        }
    }
}

class GroceryList
{
    private ArrayList<String>groceryList=new ArrayList<String>();
    public void addGroceryItem(String item)
    {
        groceryList.add(item);
    }

    public void printGroceryList()
    {
        System.out.println("you have "+groceryList.size()+"items in your grocery list");
        for(int i=0;i<groceryList.size();i++)
        {
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }
    public void modifyGroceryItem(int position,String newItem)
    {
        groceryList.set(position,newItem);
        System.out.println("Grocery item "+(position+1)+"has been modified");
    }
    public void removeGroceryItem(int position)
    {
        String theItem=groceryList.get(position);
        groceryList.remove(position);
    }
    public String findItem(String searchItem)
    {
        boolean exists=groceryList.contains(searchItem);
        int position=groceryList.indexOf(searchItem);
        if(position>=0)
        {
            return groceryList.get(position);
        }
        return null;
    }

}
