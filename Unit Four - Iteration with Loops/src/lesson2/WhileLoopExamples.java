package lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileLoopExamples {
    public static void main(String[] args) {
        // exampleOne();
        // exampleTwo();
        // int result = exampleThree();
        // int result = exampleFour(10, 20);

        // int result = exampleFive(1,100);
        // System.out.println(result);

        int result = exampleSix(1,100);
    }


    private static int exampleFive(int min, int max) {
        int sum = 0;

        for (int i = min; i <= max; i++){
            sum += i;
        }
        return sum;
    }


    private static int exampleFour(int min, int max) {
        boolean isValid = false;
        int result = 0;
        Scanner in = new Scanner(System.in);

        while (!isValid){
            System.out.println("Please enter a number from " + min + " to " + max + ": ");

            try{
                result = Integer.parseInt(in.nextLine());
                if (result < min || result > max)
                    System.out.println("Not in the specified range.");
            }catch(NumberFormatException badThing){
                System.out.println("ERIC STOP");
            }
        }
        return result;
    }


    private static int exampleThree() {
        int result = -1;
        Scanner in = new Scanner(System.in);


    // while(result <1 || result > 10){
        while (!(result >= 1 && result <= 10)){
            System.out.println("Please enter a number from 1-10: ");
            result = in.nextInt();
        }
        return 0;
    }


    private static void exampleTwo() {
        int numEven = 0;
        for (int i = 0; i < 1000000; i++){
            if (((int)(Math.random()*10 + 1) % 2 == 0)) {
                numEven++;
            }
        }
        System.out.println(numEven);
    }

    private static void exampleOne() {
        for (int i = 0; i < 1000; i++){ // i is the counter
            System.out.println(i);
        }
    }
}
