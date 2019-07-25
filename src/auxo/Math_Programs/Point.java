package auxo.Math_Programs;
/*You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields (instance variables) with name x and y of type int.

The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters x and y of type int and it needs to initialize the fields.

Write the following methods (instance methods):
* Method named getX without any parameters, it needs to return the value of x field.
* Method named getY without any parameters, it needs to return the value of y field.
* Method named setX with one parameter of type int, it needs to set the value of the x field.
* Method named setY with one parameter of type int, it needs to set the value of the y field.
* Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
* Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.
* Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.

How to find the distance between two points?To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:

d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)

Where √ represents square root.




TEST EXAMPLE

→ TEST CODE:

Point first = new Point(6, 5);
Point second = new Point(3, 1);
System.out.println("distance(0,0)= " + first.distance());
System.out.println("distance(second)= " + first.distance(second));
System.out.println("distance(2,2)= " + first.distance(2, 2));
Point point = new Point();
System.out.println("distance()= " + point.distance());

OUTPUT

distance(0,0)= 7.810249675906654
distance(second)= 5.0
distance(2,2)= 5.0
distance()= 0.0

NOTE: Use Math.sqrt to calculate the square root √.

NOTE: Try to avoid duplicated code.

NOTE: All methods should be defined as public NOT public static.

NOTE: In total, you have to write 7 methods.

NOTE: Do not add a main method to the solution code.*/

import java.util.Scanner;

public class Point {
    int x;
    int y;

    Point() {

    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner ( System.in );
        {

            System.out.println ( "enter the main points" );
            int x = scanner.nextInt ();
            int y = scanner.nextInt ();
            Point point = new Point ( x, y );
            System.out.println ( "point distance from 0,0 =" + point.distance () );
            System.out.println ( "enter the points you want to calculate" );
            int dis_x = scanner.nextInt ();
            int dis_y = scanner.nextInt ();

            System.out.println ( "distance between (" + point.x + " " + point.y + ")" + "  (" + dis_x + " " + dis_y + " )=" + point.distance ( dis_x, dis_y ) );
            System.out.println ( "enter the passing point " );
            int p_x = scanner.nextInt ();
            int p_y = scanner.nextInt ();
            Point sec = new Point ( p_x, p_y );
            System.out.println ( "distance between new point to old point =" + point.distance ( sec ) );

        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt ( ((this.x - 0) * (this.x - 0)) + ((this.y - 0) * (this.y - 0)) ); //Distance between two points formula
    }

    public double distance(int x, int y) {
        return Math.sqrt ( ((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y)) );//Distance between two points formula
    }

    public double distance(Point point) {
        return Math.sqrt ( ((x - point.x) * (this.x - point.x)) + ((this.y - point.y) * (this.y - point.y)) );//Distance between two points formula
    }
}