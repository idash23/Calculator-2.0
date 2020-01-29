
/* Calculator 2
 Cliford, Charuka
 */

import java.text.DecimalFormat;
import java.text.spi.DecimalFormatSymbolsProvider;
import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {

        double num1, num2;
        String operation = "";

        Scanner scan = new Scanner(System.in);

        // print welcome message

        System.out.println("Welcome to the Cliford Calculator");

        {
            while (!operation.equals("EXIT")) {

                // read the two operands
                System.out.print("Enter the first number:");
                num1 = scan.nextDouble();

                // print the menu
                System.out.println(
                        "\nOperations are:" + "\n\t ADD or + for addition" + "n\t\" SUBTRACT or - for subtraction"
                                + "\n\t\" MULTIPLY  or * for multiplication" + "\n\t\" DIVIDE or  / for divison"
                                + "\n\t MODULUS or % for modulus" + "n\t EXIT or e for Exit ");

                // select operation
                System.out.print("Enter your operation : ");
                operation = scan.next();
                operation = operation.toUpperCase();

                System.out.print("Enter the second number:");
                num2 = scan.nextDouble();

                if (operation.equals("+"))

                {
                    Add(num1, num2);
                }
                if (operation.equals("-")) {
                    Subtract(num1, num2);

                }
                if (operation.equals("/")) {
                    Divide(num1, num2);

                }
                if (operation.equals("*")) {
                    Multiply(num1, num2);

                }
                if (operation.equals("%")) {
                    Moduls(num1, num2);

                }

            }

        }

    }

    // methods
    public static void Add(double _num1, double _num2) {
        System.out.println("The Sum is: " + (_num1 + _num2));
    }

    public static void Subtract(double _num1, double _num2) {
        System.out.println("The difference is: " + (_num1 - _num2));
    }

    public static void Multiply(double _num1, double _num2) {
        System.out.println("The product is: " + (_num1 * _num2));
    }

    public static void Divide(double _num1, double _num2) {
        if (_num2 == 0)
            System.out.println("Undefined");
        else
            System.out.println("The quotient is: " + (_num1 / _num2));
    }

    public static void Moduls(double _num1, double _num2) {
        System.out.println("The modulus is: " + (_num1 % _num2));
    }

    public static void Exit() {
        {
            System.out.println("exit");
            System.exit(0);
        }

    }
}