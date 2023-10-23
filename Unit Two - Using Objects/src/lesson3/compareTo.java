package lesson3;

public class compareTo {
    public static void main(String[] args) {
        System.out.println("grass".compareTo("grass"));
        System.out.println("alpha".compareTo("zoo"));
        System.err.println("zoo".compareTo("alpha"));

        System.out.println("A".compareTo("C"));
        System.err.println("C".compareTo("A"));
        // ASCII table
        System.out.println("alpha".compareTo("alpha"));

        String s = "Hello";
        String t = "Hello";

        System.out.println(s.compareTo(t));
        System.out.println(s.equals(t));

    System.out.println("alphabet".compareTo("Alphabet"));

    System.out.println("bear".compareTo("bear crawl"));

        // "2 words" wtih a space in between compares lengths
    }
    
}
