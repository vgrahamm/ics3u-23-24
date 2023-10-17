package lesson2;

public class StringExamples {
    public static void main(String[] args) {
        String s1 = new String("Alphabet Soup");        //s1 was created with a constructor
        String s2 = ("happy");                          //s2 was created using a String Literal

        int strLength = s1.length();
        System.out.println(s1 + " has a length of " + strLength);
        System.out.println(s2 + " has a length of " + s2.length());
        System.out.println("Lester has a length of " + "Lester".length());

        String s = "ppy";
        System.out.println("The index of ppy in " + s + " in " + s2 + " is " + s2.indexOf(s)); 
        /* be careful for the indexing - characters - 1 */
        System.out.println("The index of happy in " + s2 + " is " + s + " is " + s.indexOf(s2));

        String subString1 = s1.substring(5, 8);     // i want "bet"
        System.out.println(subString1);
    }
}
