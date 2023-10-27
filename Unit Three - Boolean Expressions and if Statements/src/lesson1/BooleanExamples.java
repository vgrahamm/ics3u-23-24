package lesson1;

public class BooleanExamples {
    public static void main(String[] args) {
        boolean isHappy = true;
        boolean hasBlueShoes = false;
          // is, has, or contains

        System.out.println(isHappy);
        System.out.println(hasBlueShoes);


        System.out.println(4>3);
        System.out.println(4<3);

        System.out.println(4>=3);
        System.out.println(4<=3);

        System.out.println(4==3);
        
        String str = "Hello";
        String str1 = new String ("Hello");
        System.out.println("Hi".equals(str)); 
        System.out.println("Hello".equals(str));
        System.out.println(str1 == "Hello");
        // dont use == for constructors, they are stored in different lcoatois

        System.out.println(4!=3);               // true (! is not equal)

        System.out.println(!isHappy);           // false because !true is false
        System.out.println(isHappy == false);   // both are right    

        System.out.println(!"Hello".equals(str));
    }
    
}
