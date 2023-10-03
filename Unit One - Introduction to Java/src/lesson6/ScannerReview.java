package lesson6;

import java.util.Scanner;

public class ScannerReview {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
    // int x
    // scanner input
    // int is the type of variable
    // x is the name

    /*
    OR

    Scanner input;
    input = new Scanner(System.in);

     */
    
     System.out.print("Please enter an integer: ");
     int x = input.nextInt();

     System.out.println(x);

     System.out.print("Please enter a decimal number: ");
     double y = input.nextDouble();

     System.out.println(y);

     //

    System.out.print("Please enter a double number ");
    double e = input.nextDouble();

    System.out.println(e);


    System.out.print("Please enter an int: ");
    double z = input.nextDouble();

    System.out.println(z);

    System.out.print("The average of both numbers is: ");
    System.out.println((z+e)/2);
    }
  
}
