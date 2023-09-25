package lesson3;

public class checks {
    public static void main(String[] args) {
        int num = 75;
        int onesDigit = num % 10;
        int tensDigit = num / 10;
        System.out.print(onesDigit);
        System.out.println(tensDigit);

        int a = 4;
        int b = 5;
        a++;
        b++;
        int c = a + b;
        a -= 1;
        System.out.println(a + c);
    }
}
