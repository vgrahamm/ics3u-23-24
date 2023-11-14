package lesson2;

public class check {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        System.out.print((b || (!a || b)) + " ");
        System.out.print(((!b || !a) && a) + " ");
        System.out.println(!(a && b) && b);
    }
    
}
