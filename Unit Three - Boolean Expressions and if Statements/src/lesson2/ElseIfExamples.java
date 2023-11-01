package lesson2;

public class ElseIfExamples {

public static void main(String[] args) {
    boolean isHappy = true;

    if (isHappy)
        System.out.println("I am glad you are happy on Halloween!");
    else
        System.out.println("sorry you are not happy");

    /*     boolean isHappy = false;
    if (isHappy)
    System.out.println("I am glad you are happy on Halloween!");
    it won't print anything

    if (!isHappy)
    System.out.println("I am glad you are happy on Halloween!")
    */

    if (isHappy)
        System.out.println("I am glad you are happy on Halloween!");
    else if (!isHappy)
        System.out.println("sorry you are not happy");


    // all 3 things do the same thing
}
}
