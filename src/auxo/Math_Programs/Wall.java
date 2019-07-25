package auxo.Math_Programs;
/*Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.

        The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters width and height of type double and it needs to initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the height parameter is less than 0 it needs to set the height field value to 0.

        Write the following methods (instance methods):
        * Method named getWidth without any parameters, it needs to return the value of width field.
        * Method named getHeight without any parameters, it needs to return the value of height field.
        * Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
        * Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.
        * Method named getArea without any parameters, it needs to return the area of the wall.


        TEST EXAMPLE

        → TEST CODE:

        1 Wall wall = new Wall(5,4);
        2 System.out.println("area= " + wall.getArea());
        3
        4 wall.setHeight(-1.5);
        5 System.out.println("width= " + wall.getWidth());
        6 System.out.println("height= " + wall.getHeight());
        7 System.out.println("area= " + wall.getArea());

        → OUTPUT:

        area= 20.0
        width= 5.0
        height= 0.0
        area= 0.0


        NOTE: All methods should be defined as public NOT public static.

        NOTE: In total, you have to write 5 methods and 2 constructors.

        NOTE: Do not add a main method to the solution code.*/

import java.util.Scanner;

public class Wall {
    double width;
    double height;

    Wall() {

    }

    public Wall(double width, double height) {

        this.width = notEqual ( width );
        this.height = notEqual ( height );

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner ( System.in );
        double width = sc.nextDouble ();
        double height = sc.nextDouble ();
        Wall wall = new Wall ( height, width );
        wall.setHight ( height );
        wall.setWidth ( width );
        System.out.println ( "area : " + wall.area () );

    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = notEqual ( width );
    }

    public void setHight(double height) {
        this.height = notEqual ( height );
    }

    public double area() {
        double area = width * height;
        return area;
    }

    public double notEqual(double number) {
        if (number > 0) {
            return number;
        } else
            return 0;

    }
}
