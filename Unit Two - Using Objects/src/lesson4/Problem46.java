package lesson4;

import java.util.Scanner;

public class Problem46 {
    public static void main(String[] args) {

        // random capital letter

        Scanner in = new Scanner(System.in);
        int ASCII = (int)(Math.random()*26)+65;

        char letter = (char) + ASCII;

        System.out.println(ASCII);
        System.out.println(letter);
        in.close();
    }
    
}
