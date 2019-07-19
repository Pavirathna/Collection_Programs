package Practice_Programs;

import java.util.ArrayList;

public class InnerClassExample {
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox ( 6 );
        Gearbox.Gear first = mcLaren.new Gear ( 1, 12.3 );// Creating object for inner class
        System.out.println ( first.driveSpeed ( 1000 ) );
    }
}

class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<> ();
        Gear neutral = new Gear ( 0, 0.0 );
        this.gears.add ( neutral );//add to the array list

    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if ((number > 0) && (number <= maxGears)) {
            this.gears.add ( new Gear ( number, ratio ) );
        }
    }

    public void chagedGear(int newGear) {
        if ((newGear >= 0) && (newGear < this.gears.size ()) && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println ( "Gear" + newGear + " selected" );
        } else {
            System.out.println ( "Grind!!" );
            this.currentGear = 0;
        }

    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println ( "Scream!!!" );
            return 0.0;
        }
        return revs * gears.get ( currentGear ).getRatio ();
    }

    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {

            return revs * (this.ratio);
        }

        public double getRatio() {
            return ratio;
        }
    }
}