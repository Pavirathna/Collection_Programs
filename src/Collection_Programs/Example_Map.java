package Collection_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example_Map {
    public static void main(String[] args) {
        Map m=new HashMap();
        m.put(1,"pa");
        m.put(25,"Aa");
        m.put(22,"va");
        System.out.println("Map Elements"+"\n"+m);
        HashMap<Character,Integer> hm = new HashMap<>();
        Scanner sc=new Scanner(System.in);
        st_push(hm);

    }
    static void st_push(HashMap<Character,Integer> hm) {

      //  hm.put(insert);
        int j=1;

        for (char i = 'a'; i <= 'b'; i++) {
            for(j=0;j<=5;j++){
            hm.put(i,j);

        }


    }

        System.out.println(hm);
}}
