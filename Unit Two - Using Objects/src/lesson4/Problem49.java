package lesson4;

import java.util.Scanner;

public class Problem49 {
    public static void main(String[] args) {
        
        // power of random numbers

        Scanner in = new Scanner(System.in);
        int base = (int)(Math.random()*10)+1;
        int power = (int)(Math.random()*10)+1; 
        
        System.out.println(base);
        System.out.println(power);
        System.out.println((int)Math.pow(base, power));
        in.close();
    }
    
}
