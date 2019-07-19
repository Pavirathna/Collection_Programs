package auxo;
/*Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.

Write the following methods (instance methods):

*Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
*Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
*Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
*Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
*Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
*Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
*Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
*Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.

TEST EXAMPLE

TEST CODE:

SimpleCalculator calculator = new SimpleCalculator();
calculator.setFirstNumber(5.0);
calculator.setSecondNumber(4);
System.out.println("add= " + calculator.getAdditionResult());
System.out.println("subtract= " + calculator.getSubtractionResult());
calculator.setFirstNumber(5.25);
calculator.setSecondNumber(0);
System.out.println("multiply= " + calculator.getMultiplicationResult());
System.out.println("divide= " + calculator.getDivisionResult());

OUTPUT

add= 9.0
subtract= 1.0
multiply= 0.0
divide= 0.0

TIPS:

*add= 9.0 is printed because 5.0 + 4 is 9.0
*subtract= 1.0 is printed because 5.0 - 4 is 1.0
*multiply= 0.0 is printed because 5.25 * 0 is 0.0
*divide= 0.0 is printed because secondNumber is set to 0


NOTE: All methods should be defined as public NOT public static.

NOTE: In total, you have to write 8 methods.

NOTE: Do not add the main method to the solution code.*/

import java.util.Scanner;

public class SimpleCalculator {

    double firstNumber;
    double secondNumber;

    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter 2 values :" );
        SimpleCalculator calculator = new SimpleCalculator ();
        double firstNumber = sc.nextDouble ();
        double secondNumber = sc.nextDouble ();
        calculator.setFirstNumber ( firstNumber );
        calculator.setSecondNumber ( secondNumber );
        System.out.println ( "Addition Result:" + calculator.getAdditionalResult () );
        System.out.println ( "Subtraction Result:" + calculator.getSubtractionResult () );
        System.out.println ( "Multiplication Result :" + calculator.getMulitiplicationResult () );
        System.out.println ( "Division Result :" + calculator.getDivisionResult () );

    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;

    }

    public double getSecondNumber() {
        return firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionalResult() {
        double addtionResult = firstNumber + secondNumber;
        return addtionResult;
    }

    public double getSubtractionResult() {
        double subtractionResult = firstNumber - secondNumber;
        return subtractionResult;
    }

    public double getMulitiplicationResult() {
        double mulResualt = firstNumber * secondNumber;
        return mulResualt;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        } else {
            double divisionResult = firstNumber / secondNumber;
            return divisionResult;
        }

    }
}