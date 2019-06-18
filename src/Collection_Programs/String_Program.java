package Collection_Programs;

public class String_Program {
    public static void main(String[] args) {
        String w="Hellohai";
        String w2="hello";
        char[]word=w.toCharArray();
        char[]duplicateword=w.toCharArray();
        int c=0;
        char a=' ';
        for(int i=0;i<word.length-1;i++)
        { for(int j=0;j<word.length-1;j++)
            {
             if(word[i]==duplicateword[j])
             {
                 duplicateword[j]=a;
                 c++;
             }

            }
            if(c>0) {
                System.out.println(word[i]+ " = " + c );
            }
            c=0;
        }
    }

}
