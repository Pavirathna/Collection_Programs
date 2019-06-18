package Collection_Programs;

import java.util.*;

public class Theatre_Main {
   private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Theatre theatre=new Theatre("EVP",9,12);
      //  theatre.getSeats();
        System.out.println("Enter seat number :");
        String sNum;
      /*  if (theatre.reserveSeat(sNum)){
            System.out.println("Please Pay");
        }else
        {
            System.out.println("Sorry ,Seat is taken");
        }*/
        List<Theatre.Seat>seatCopy=new ArrayList<>(theatre.seats);
        printList(seatCopy);
        System.out.println("Enter seat number :");
        sNum=sc.next();
        seatCopy.get(3).reserve();
        if(theatre.reserveSeat(sNum)){
            System.out.println("Please pay for "+sNum );
        }else{
            System.out.println("SeatAlready Reserved");
        }

        Collections.shuffle(seatCopy);
        System.out.println("Printing SeatCopy ");
        printList(seatCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);

        Theatre.Seat minSeat= Collections.min(seatCopy);
        Theatre.Seat maxSeat= Collections.max(seatCopy);
        System.out.println("Minimum seat Number is "+minSeat.getSeatNumber());
        System.out.println("Maximum seat Number is "+maxSeat.getSeatNumber());


        sortList(seatCopy);
        System.out.println("Printing Sorted Copy ");
        printList(seatCopy);

    }
    public static void printList(List<Theatre.Seat>list){
        for(Theatre.Seat seat:list){
            System.out.print(" "+seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=======================================================================================================");
    }
    public static void sortList(List<? extends Theatre.Seat> list)
    {
        for (int i=0;i<list.size()-1;i++){
            for (int j=i+1;j<list.size()-1;j++)
            {
                if(list.get(i).compareTo(list.get(j))>0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }


}
