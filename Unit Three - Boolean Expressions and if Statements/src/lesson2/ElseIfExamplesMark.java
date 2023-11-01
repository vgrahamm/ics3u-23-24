package lesson2;

public class ElseIfExamplesMark {

    public static void main(String[] args) {
        
    int mark = 65;

    if (mark >= 80)
        System.out.println("A");
    else if (mark >=70)
        System.out.println("B");
    else if (mark >=60)
        System.out.println("C");
    else if (mark >=50)
        System.out.println("D");
    else 
        System.out.println("F");

    if (mark >= 80)
        System.out.println("A");
    if (mark >=70)
        System.out.println("B");
    if (mark >=60)
        System.out.println("C");
    if (mark >=50)
        System.out.println("D");
    else 
        System.out.println("F");

        // second one is wrnog but they could both work for the range 0-59
    }
}
