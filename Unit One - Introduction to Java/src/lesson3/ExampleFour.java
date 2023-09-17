package lesson3;

public class ExampleFour {
    public static void main(String[] args) {
        // to get last number, always mod by 10
        int num = 6731;
        
        int digit1 = num % 10;          // 6731 % 10 = 1
        int digit4 = num / 1000;        // 6731 / 1000 = 6
        int digit2 = num / 10 % 10;     // 6731 / 10 % 10 = 3
        // or int digit2 = num % 100 / 10; (6731 / 10 = 31 / 10 = 3)

        int digit3 = num / 100 % 10;    // 6731 / 100 = 67 % 10 = 7

        // or int digit3 = num % 1000 / 100; (6731 % 1000 = 731 / 100 = 7)

        int sum = digit1 + digit2 + digit3 + digit4;
        // sum of the digits
        System.out.println(sum);

    }
}

