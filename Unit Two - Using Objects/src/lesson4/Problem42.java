package lesson4;

import java.util.Scanner;

public class Problem42 {
    public static void main(String[] args) {

        //exponential
        
        Scanner scan = new Scanner(System.in);
        System.out.println("give me a number: ");
        int x = scan.nextInt();

        System.out.println(x);

        System.out.println("the square root of that number is " + Math.sqrt(x));  

        scan.close();

    }
    
}
