package lesson3;

import java.util.Scanner;

public class EC00Contests {
    public static void main(String[] args) {
        // frame2010(3,4,1,2);
        wordFrame("CANADA");
    }

    private static void wordFrame(String string) {
        int len = string.length();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        for (int i=0;i<len+2; i++){
            if (i== 0 || i == len+1)
                System.out.print("* ");
            else
                System.out.print(str.substring(i-1, i) + " ");
        }

        System.out.println();
         for (int i=len+1;i>=0; i--){
            if (i== 0 || i == len+1)
                System.out.print("* ");
            else
                System.out.print(str.substring(i-1, i) + " ");
        }
    }

    private static void frame2010(int M, int N, int P, int Q) {
        for (int i = 0; i < Q; i++){
            for (int j = 0; j < 2*P + 2*Q + N; j++){
                System.out.print("#");
            }
            System.out.println();
        }

        for (int i = 0; i < P; i++){
            for (int j = 0; j < Q; j++){
                System.out.print("#");
        }
         for (int j = 0; j < N+2*P; j++){
            System.out.print("+");
         }
         for (int j = 0; j < Q; j++){
            System.out.print("#");
        }
        System.out.println();
    }
    for (int i = 0; i < M; i++){
        for (int j = 0; j < P; j++){
            for (int z = 0; z < Q; z++){
                System.out.print("#");
        }
        for (int z = 0; z < P; z++){
            System.out.print("+");
         }
        for (int z = 0; z < N; z++){
            System.out.print(".");
         }
        for (int z = 0; z < P; z++){
            System.out.print("+");
         }
        for (int z = 0; z < Q; z++){
            System.out.print("#");
        }
    }
    System.out.println();
}
        for (int i = 0; i < P; i++){
            for (int j = 0; j < Q; j++){
                System.out.print("#");
        }
         for (int j = 0; j < N+2*P; j++){
            System.out.print("+");
         }
         for (int j = 0; j < Q; j++){
            System.out.print("#");
        }
        System.out.println();
}
    for (int i = 0; i < Q; i++){
            for (int j = 0; j < 2*P + 2*Q + N; j++){
                System.out.print("#");
            }
            System.out.println();
        }
        
        if (M>50 || N>50){
            System.out.println("errorrrrrrrrrrrrrrrrrrrrrrr");
        }
    }
}
