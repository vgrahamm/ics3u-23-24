package lesson2;

public class withoutEnd2 {
    public static void main(String[] args) {
        String lengthOverTwo = "Eight";
        String withoutEnd = lengthOverTwo.substring(0, 1) + lengthOverTwo.substring(lengthOverTwo.length()-1) + lengthOverTwo.substring(0, 1) + lengthOverTwo.substring(lengthOverTwo.length()-1);
        System.out.println(withoutEnd);

        // QUESTION 8

    }
}
