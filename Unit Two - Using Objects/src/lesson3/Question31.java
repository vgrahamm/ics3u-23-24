package lesson3;

public class Question31 {
    public static void main(String[] args) {
    String tag = "[[]]";
    String word = "Lol";

    String result = tag.substring(0, 2) + word + tag.substring(2);
    System.out.println(result);
    }
}
