package lesson4;

public class ExampleThree {
    public static void main(String[] args) {
        int mark1 = 84, mark2 = 91, mark3 = 97;
        int numTests = 3;

        // Three types of errors: 


        //logic errors: program runs, doesn't crash but you don't get the expected output 
            //...no red therefore it is hardest to find
        double average = mark1 + mark2 + mark3 / (double)numTests;


        //syntax error: wont run (compile), red squiggle, error in the Java Code, forgetting a "" or ;
            //easy to figure out
            //System.out.println("Hello World); MISSING QUOTE


        //runtime errors: program runs and then crashessssssssssssssssssssssss when it is running
            // dividing by 0
            int number = 7 / 0;

            /*
             * Exception in thread "main" java.lang.ArithmeticException: / by zero
        at lesson4.ExampleThree.main(ExampleThree.java:16)
             */

        int y = 3;
    }
}
