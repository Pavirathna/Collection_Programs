package Collection_Programs;

public class String_Program {
    public static void main(String[] args) {
        String word1="Hellohai";
        String word2="hello";
        char[]word=word1.toCharArray();
        char[]duplicateword=word1.toCharArray();
        int count=0;
        char a=' ';
        for(int i=0;i<word.length-1;i++)
        { for(int j=0;j<word.length-1;j++)
            {
             if(word[i]==duplicateword[j])
             {
                 duplicateword[j]=a;
                 count++;
             }

            }
            if(count>0) {
                System.out.println(word[i]+ " = " + count );
            }
            count=0;
        }
    }

}
