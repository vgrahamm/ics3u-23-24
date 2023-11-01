package lesson2;

public class CompoundBooleanExpressions {

    public static void main(String[] args) {
        boolean isHappy = true;
        boolean hasRedShoes = false;

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true); // short-circut because both need to be true and it has false &&
        System.out.println(false && false); 

        int x = 7;
        int y = 6;

        System.out.println(x > y && x < 6);

        System.out.println(true || true); // || = or
        System.out.println(true || false);      // true || anything is true
        System.out.println(false || true); 
        System.out.println(false || false); 
    }
    
}
