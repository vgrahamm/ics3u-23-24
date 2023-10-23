package lesson2;

public class nTwice {
    public static void main(String[] args) {

        String wordey = "Valerie";
        int n = 3;
        String nTwice = wordey.substring(0, n) + wordey.substring(wordey.length()-n);

        System.out.println(nTwice);

        // QUESTION 10

    }

}