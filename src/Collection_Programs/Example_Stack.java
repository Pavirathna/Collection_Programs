package Collection_Programs;

import java.util.Scanner;
import java.util.Stack;

public class Example_Stack {

    public static void main(String args[]) {
          /*  Stack<String> stack = new Stack<String>();
            stack.push("Ayush");
            stack.push("Garvit");
            stack.push("Amit");
            stack.push("Ashish");
            stack.push("Garima");
            stack.peek();
            //stack.pop();
            Iterator<String> itr = stack.iterator();
            while (itr.hasNext()) {
                System.out.print(itr.next()+" ");
            }*/
        Stack<Character> st = new Stack<Character>();
            /*st_push(st);
            st_pop(st);
            st_push(st);
            st_peek(st);
            st_search(st,'e');
            st_search(st,'b');
            System.out.println("Stack "+st);*/
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Option for Stack Operation : 1.Push 2.pop 3.Peek 4.Check if the Stack is empty or not  5.Search 6.print Ful Stack 7. remove 8.size  9.exit");
            int check = sc.nextInt();

            switch (check) {
                case 1:
                    System.out.println("enter the character to be pushed ");
                    char c=sc.next().charAt(0);
                    st_push(st,c);
                    System.out.println("Pushed Successfully");
                    break;
                case 2:
                    st_pop(st);
                    System.out.println("Pop_up");
                    break;
                case 3:
                    System.out.println("PeeK "+ st.peek());
                    break;
                case 4:
                    System.out.println("Is Stack empty : " + st.empty());
                    break;
                case 5:
                    System.out.println("Enter char you to search ");
                    char search_element = sc.next().charAt(0);
                    st_search(st, search_element);
                    break;
                case 6:
                    //st_push(st);
                    System.out.println("Stack " + st);
                    break;
                case 7:
                    System.out.println("Enter char you  want to delete ");
                    char delete_element = sc.next().charAt(0);
                    st.removeElement(delete_element);
                    System.out.println("Deleted Successfully");
                    break;
                case 8:
                    System.out.println(st.size());
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }


    static  void st_push(Stack<Character>st,char insert)
    {

        st.push(insert);
        for(char i='a';i<'z';i++){
            st.push(i);
        }


    }

    static void st_pop(Stack<Character>st)
    {
        System.out.println(" pop:"+st.pop());

           /* for(int i='A';i<'e';i++)
            {
                Character y=(Character) st.pop();
                System.out.println(y);
            }*/
    }

    // Displaying element on the top of the stack
    static void st_peek(Stack<Character> st)
    {
        Character element = (Character) st.peek();
        System.out.println("Element on stack top : " + element);
    }

    // Searching element in the stack
    static void st_search(Stack<Character> st, Character element)
    {
        int  pos = st.search(element);

        if(pos == -1)
            System.out.println("Element not found "+element);
        else
            System.out.println("Element is found "+pos);
    }

}


