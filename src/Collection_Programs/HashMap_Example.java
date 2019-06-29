package Collection_Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMap_Example {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String Values :");
        String check=sc.next();
        System.out.println("Enter Number Sequence : (eg: 1,34,67,78,... max=100000, min=0");
        String NumberSequence=sc.next();
        CheckNumber(NumberSequence);
        char[] ch=check.toCharArray();
        Map<Character,Integer>hm=new HashMap<>();
        int count=1;

        for(int i=0;i<ch.length;i++)
        {
            if(hm.containsKey(ch[i]))
            {
                hm.put(ch[i],hm.get(ch[i])+1);
            }
            else
            {
                hm.put(ch[i],count);
            }
        }
        count=0;

        hm.forEach((k,v)->{
            System.out.format("key: %s,value: %d%n",k,v);
        });
        System.out.println("Method 2 :"+'\n'+hm);
        System.out.println("Method 3:");

        hm.entrySet().stream().forEach(e -> {
            System.out.format("key: %s, value: %d%n", e.getKey(), e.getValue());
        });
        System.out.println("Method 4:");

        Iterator<HashMap.Entry<Character, Integer>> it = hm.entrySet().iterator();

        while (it.hasNext()) {
            HashMap.Entry<Character, Integer> hmm = it.next();

            System.out.format("key: %s, value: %d%n", hmm.getKey(),
                    hmm.getValue());
        }

    }

    static void CheckNumber(String NumberSequence)
    {
        String [] cn= NumberSequence.split(",");
        Map<String, Integer> hh=new HashMap<>();
        int count=1;
        for (String ss:cn)
        {
            int numvalue=Integer.parseInt(ss);
            if((numvalue>0)&&(numvalue<100000)){
                if(hh.containsKey(ss)){
                    hh.put(ss,hh.get(ss)+1);
                }else
                {
                    hh.put(ss,count);
                }
            }else {
                System.out.println("The value is not in the Range");
            }

        } System.out.println(hh);
        System.out.println(hh.size());


        for(int i=0;i<cn.length;i++) {
                 if (hh.containsKey(cn[i])) {
                    hh.put(cn[i], hh.get(cn[i]) + 1);
                } else {
                    hh.put(cn[i], count);
                }
            }



    }


}
