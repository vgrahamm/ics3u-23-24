package lesson1;

public class test {
    public static void main(String[] args) {
        String oldStr = "ABCDEF";
        String newStr = oldStr.substring(1, 3) + oldStr.substring(4);
        System.out.println(newStr);
    }
    
}
