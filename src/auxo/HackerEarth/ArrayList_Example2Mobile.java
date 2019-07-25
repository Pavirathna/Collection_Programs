package auxo.HackerEarth;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Example2Mobile {
    private static Scanner sc=new Scanner(System.in);
    private static MobilePhone mobilephone=new MobilePhone ("8015975554");
    public static void main(String[] args) {
        boolean quit=false;
        startPhone();
        printAction();
        while(!quit)
        {
            System.out.println("\nEnter action :(6 to show available actions");
            int action=sc.nextInt();
            sc.nextLine();
            switch(action){
                case 0:
                    System.out.println("\nShutting Down");
                    quit=true;
                    break;
                case 1:
                 //  printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                  //   upDateContact();
                     break;
                case 4:
                  //  removeContact();
                    break;
                case 5:
                   // queryContact();
                    break;
                case 6:
                    printAction();
                    break;
            }

        }
    }
    private static  void addNewContact(){
        System.out.println("Enter new contact name :");
        String name=sc.nextLine();
        System.out.println("Enter Phone Number: ");
        String phone=sc.nextLine();
        Contact newContact= Contact.createContact(name,phone);
        if(mobilephone.addNewContact(newContact)){
            System.out.println("New contact added : name ="+name+", phone ="+phone);
        }else{
            System.out.println("Cannot addaed ,"+name+" already on file");
        }
    }
    private static void updateContact()
    {
        System.out.println("Enter existing contact name :");
        String name=sc.nextLine();
        Contact existingContactRecord=mobilephone.queryContact(name);
        if(existingContactRecord==null)
        {
            System.out.println("Contacts not found");
            return;
        }
        System.out.println("Enter new Contact name :");
        String newName=sc.nextLine();
        System.out.println("Enter new contact phone number :");
        String newNumber=sc.nextLine();
        Contact newContact= Contact.createContact(newName,newNumber);
        if(mobilephone.updateContact(existingContactRecord,newContact))
        {
            System.out.println("Successfully updated record");
        }
        else {
            System.out.println("Error updating record");
        }
    }

    private static void startPhone(){
        System.out.println("Starting Phone .....");
    }

    private static void printAction()
    {
        System.out.println("\n AvailableAction: \npress");
        System.out.println("0 - to shutdown\n"+
                            "1- to print contacts\n"+
                            "2- to add a new contact\n"+
                            "3- to update existing an existing contact\n"+
                            "4- to remove an existing conatact\n"+
                            "5- query if an existing contact exsists"+
                            "6- to print a list of available actions.");
        System.out.println("Choose your action");
    }
}

class Contact
{
    private String name;
    private String phoneNumber;
    public Contact(String name,String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }
    public String getName()
    {
        return name;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public static Contact createContact(String name, String phoneNumber)
    {
        return new Contact (name,phoneNumber);
    }
}

class MobilePhone
{
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber=myNumber;
        this.myContacts=new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact contact)
    {
        if(findContact(contact.getName())>0)
        {
            System.out.println("Contact is already on File");
            return  false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateContact(Contact oldContact, Contact newContact)
    {
        int foundPosition=findContact(oldContact);
        if(foundPosition<0)
        {
            System.out.println(oldContact.getName()+",was replaced with "+newContact.getName());
            return false;
        }
        this.myContacts.set(foundPosition,newContact);
        System.out.println(oldContact.getName()+" ,was replaced with "+newContact.getName());
        return true;
    }
    public boolean removeContact(Contact contact)
    {
        int foundPosition=findContact(contact);
        if(foundPosition<0)
        {
            System.out.println(contact.getName()+",was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName()+" ,was deleted");
        return  true;
    }
    private int findContact(Contact contact)
    {
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String contactName)
    {
    for(int i=0;i<this.myContacts.size();i++)
    {
        Contact contact=this.myContacts.get(i);
        if(contact.getName().equals(contactName))
        {
            return  i;
        }
    }return -1;
    }
    public String queryContact(Contact contact)
    {
        if(findContact(contact)>=0)
        {
            return contact.getName();
        }
        return  null;
    }
    public Contact queryContact(String name)
    {
        int position=findContact(name);
        if(position>0){
            return this.myContacts.get(position);
        }
        return  null;
    }
    public void printContacts(){
        System.out.println("Contacts List");
        for(int i=0;i<this.myContacts.size();i++)
        {
            System.out.println((i+1)+"."+this.myContacts.get(i).getName()+"->"+
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}
