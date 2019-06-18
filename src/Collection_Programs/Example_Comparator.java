package Collection_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    public int compareTo(Student st){
        if(rollno==st.rollno)
            return 0;
        else if(rollno>st.rollno)
            return 1;
        else
            return -1;
    }

    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}
//Creating a test class to sort the elements
public class Example_Comparator{
    public static void main(String args[]){
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(1000,"Vijay",23));
        al.add(new Student(106,"Ajay",20));
        al.add(new Student(105,"Jai",21));

        Collections.sort(al);
        for(Student st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
        System.out.println("Sorting by Name");
//Using NameComparator to sort the elements
        Collections.sort(al,new NameComparator());
//Traversing the elements of list
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("sorting by Age");
//Using AgeComparator to sort the elements
        Collections.sort(al,new AgeComparator());
//Travering the list again
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
class AgeComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}
class NameComparator implements Comparator<Student> {
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}

