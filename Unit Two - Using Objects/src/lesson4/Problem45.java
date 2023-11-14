package lesson4;

import java.util.Scanner;

public class Problem45 {
    public static void main(String[] args) {

        // string comparison
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word1 = in.next();
        System.out.print("Enter another word: "); 
        String word2 = in.next();

        System.out.println("Are they equal: " + ((word1).equals(word2)));

        in.close();
    }
}
