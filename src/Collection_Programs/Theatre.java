package Collection_Programs;

import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats=new ArrayList<>();


    public Theatre(String theatreName,int numRows,int seatPerRow){
        this.theatreName=theatreName;

        int lastRow='A'+(numRows-1);
        for(char row='A';row<=lastRow;row++){
            for(int  seatNum=1;seatNum<=seatPerRow;seatNum++)
            {
                //Seat seat=new Seat(seatNum);
              Seat seat=new Seat(row+String.format("%02d",seatNum));
              seats.add(seat);
            }
        }
    }
    public String getTheatreName(){
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber)
    {
        int low =0;
        int high=seats.size()-1;
        System.out.println(seats.size());
        while(low<=high){
            System.out.println(".");
            int mid =(low+high)/2;
            Seat midVal=seats.get(mid);
            int cmp=midVal.getSeatNumber().compareTo(seatNumber);
            if(cmp<0)
            {
                low =mid+1;
            }else if(cmp>0){
                high=mid-1;
            }else{
                return seats.get(mid).reserve();
            }
        }
        System.out.println("There is no seat "+ seatNumber);
        return false;

      /* Seat requestedSeat=new Seat(seatNumber);

        int foundSeat=Collections.binarySearch(seats,requestedSeat,null);
        if(foundSeat>=0)
        {
            return seats.get(foundSeat).reserve();
        }else{
            System.out.println("There is no seat "+seatNumber);
        }


      /*  for(Seat seat:seats){
            if(seat.getSeatNumber().equals(seatNumber)){
                requestedSeat=seat;
                break;
            }
        }
        if(requestedSeat==null){
            System.out.println("This is no seat"+seatNumber);
            return  false;
        }
        return requestedSeat.reserve();
         
       */
    }

    public void getSeats(){
        for(Seat seat:seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved=false;

        public Seat(String seatNumber){
            this.seatNumber=seatNumber;
        }
        public  int compareTo(Seat seat){
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved=true;
                System.out.println("Seat"+ seatNumber +"reserved");
                return true;
            }else
                return false;
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved=false;
                System.out.println("Reservation of seat "+ seatNumber +"cancelled");
                return true;
            }else
            {
                return false;
            }
        }

        public String getSeatNumber(){
            return seatNumber;
        }


    }


}
