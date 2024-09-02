//import stuff here
import java.util.Scanner;
import java.lang.Math;
//Your code here

public class Program8 {
    public static void main(String[] args) {
        //initialize variables
        int integer1 = 0;
        int integer2 = 0;                                   
        Scanner numScanner = new Scanner(System.in);
        //ask for numbers
        System.out.print("Enter number 1: ");
        integer1 = numScanner.nextInt();
        System.out.println("");
        System.out.print("Enter number 2: ");
        integer2 = numScanner.nextInt();
        System.out.println("");
        //find all calculations
        int sum = integer1 + integer2;
        int difference = integer1 - integer2;
        int product = integer1 * integer2;
        double average = (integer1 + integer2) / 2.0;
        int absvalue = Math.abs(difference);
        int maximum = 0;
        int minimum = 0;
        if (integer1 >= integer2) {
            maximum = integer1;
            minimum = integer2;
        } else {
            maximum = integer2;
            minimum = integer1;
        }
        //report all calculations
        System.out.println("Sum = " + sum);
        System.out.println("");
        System.out.println("Difference = " + difference);
        System.out.println("");
        System.out.println("Product = " + product);
        System.out.println("");
        System.out.println("Average = " + average);
        System.out.println("");
        System.out.println("Absolute value = " + absvalue);
        System.out.println("");
        System.out.println("Maximum = " + maximum);
        System.out.println("");
        System.out.println("Minimum = " + minimum);
    }
}

//Paste console output below:
/*
Enter number 1: 13

Enter number 2: 20

Sum = 33

Difference = -7

Product = 260

Average = 16.5

Absolute value = 7

Maximum = 20

Minimum = 13
*/
