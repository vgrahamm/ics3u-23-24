package lesson4;

public class ExampleOne {
    public static void main(String[] args) {
        int mark1 = 84, mark2 = 91, mark3 = 97;
        int numTests = 3;

        //double average = (mark1 + mark2 + mark3) / (double)numTests;      it works
        //double average = (double)(mark1 + mark2 + mark3) / numTests;      it works. brackets go first & casting goes second
        //double average = (mark1 + mark2 + mark3) / (double)numTests;      it works

        double average = (double)((mark1 + mark2 + mark3) / numTests);
        // cast too late = (int answer 90 and then just adds a 0)

        System.out.println(average);
    }
}
