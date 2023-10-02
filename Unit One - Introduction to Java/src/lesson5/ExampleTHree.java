package lesson5;

import java.util.Scanner;

public class ExampleTHree {
    public static void main(String[] args) {
        Scanner input;
        
        input = new Scanner(System.in);

        System.out.print("Please enter a temperature in Fahrenheit: ");
        int fahrenheit = input.nextInt();

        double celcius = ((double)fahrenheit - 32) * 5 / 9;

        System.out.println("The temperature in Celcius is: " + celcius);

        input.close();

    }
}
