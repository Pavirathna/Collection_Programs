package auxo.Practice_Programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        LinkedList<String>placesToVisit=new LinkedList<>();
        addInOrder(placesToVisit,"Poonamallee");
        addInOrder(placesToVisit,"America");
        addInOrder(placesToVisit,"Parris");
        addInOrder(placesToVisit,"Canada");
        addInOrder(placesToVisit,"China");
        addInOrder(placesToVisit,"Nepal");
        printList(placesToVisit);
        addInOrder(placesToVisit,"Washington");
        addInOrder(placesToVisit,"japan");
        printList(placesToVisit);
        visit(placesToVisit);
      /*  placesToVisit.add("Ponnamallee");
        placesToVisit.add("Kundrathur");
        placesToVisit.add("porur");
        placesToVisit.add("Gerugambakkam");
        placesToVisit.add("Siruseri");
        placesToVisit.add("Tambaram");
        placesToVisit.add("kovur");

        printList(placesToVisit);

        placesToVisit.add(1,"navallur"); //add element
        printList(placesToVisit);

        placesToVisit.remove(1);                 // remove element
        printList(placesToVisit);

        boolean status=placesToVisit.contains("kovur"); // contains Element
        if(status)
        {
            System.out.println(" List Contains kovur");
        }else
            System.out.println(" list doesn't contain kovur");

        int size=placesToVisit.size();
        System.out.println("Size Of the list :"+size);  //size of the list

        String element=placesToVisit.get(2);         // get method
        System.out.println("Element returned by get() :"+element);

        placesToVisit.set(2,"isChanged");           // set method
        System.out.println("LinkedList after set element :"+placesToVisit);

        placesToVisit.peekLast();
        System.out.println("Peek () :"+placesToVisit);
*/
    }
    private static  void printList(LinkedList<String> linkedlist){
        Iterator<String>i=linkedlist.iterator();
        while(i.hasNext())
        {
            System.out.println(" Now visting  "+i.next());
        }
        System.out.println("==========================");
    }

    private static boolean addInOrder(LinkedList<String>linkedList,String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                //new City should appear before this one
                // British -> India
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList cities){
        Scanner sc= new Scanner(System.in);
        boolean quit=false;
        boolean goingForward=true;
        ListIterator<String> listIterator=cities.listIterator();

        if(cities.getFirst()=="" ){
            System.out.println("No Cities in the  itenerary");
            return;
        }else{
            System.out.println(" Now Visiting "+ listIterator.next());
            printMenu();
        }

        while (!quit){
            int action =sc.nextInt();
            sc.nextLine();
            switch(action){
                case 0:
                    System.out.println("Holiday (vaction ) over");
                    quit=true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now Visiting "+listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list");
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now visiting "+listIterator.previous());
                        }goingForward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now Visiting "+listIterator.previous());
                    }else{
                        System.out.println("We are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
                default:
                    System.out.println("Invalid Value");
            }
        }
    }
    private static void printMenu(){
        System.out.println(" Availabe actions :\n"+
                "1 - go to next city\n"+
                "2 - go to previous city \n"+
                "3 - print menu options\n"+
                "0- quit ");
    }
}
