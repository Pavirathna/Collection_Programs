package HackerEarth;

/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
//import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int tc = Integer.parseInt(str);

        int seat[] = new int[tc];
        int seatOpp[] = new int[tc];
        String seatType[] = new String[tc];

        for(int t = 0; t<tc;t++) {
            str = br.readLine();
            seat[t] = Integer.parseInt(str);
        }

        //logic for facing seat and type
        int q;
        int r;
        for(int i = 0; i<tc;i++) {
            q = seat[i]/12;
            r = seat[i]%12;
            if(r == 0) {
                seatOpp[i] = 12*q - 11;
            }else {
                seatOpp[i] = 12*q + 13 - r;
            }

            //System.out.println("seat nUmber " + seatOpp[i]);

            if(r == 0 || r == 6 || r ==7 || r == 1) {
                seatType[i] = "WS";
            }else if(r == 4 || r == 9 || r == 10 || r == 3) {
                seatType[i] = "AS";
            }else {
                seatType[i] = "MS";
            }

            //seatMap.put(12*q + 13 - r, type);
            //seatOpp[i] = new Pair<Integer, String>(12*q + 13 - r, type);
        }

        //Display Seat no
        for(int i = 0; i<tc;i++) {
            //System.out.print(seatMap.values());
            System.out.println(seatOpp[i] + " " + seatType[i]);
        }
    }
}
