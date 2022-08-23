package arrayExercise6;

import java.util.Locale;
import java.util.Scanner;

public class SumOfVectors {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values the vectors will get? ");
        int number = sc.nextInt();
        int[] vectorA = new int[number];
        int[] vectorB = new int[number];

        System.out.println("Enter the Vector A values:");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print("Enter a number: ");
            vectorA[i] = sc.nextInt();
        }

        System.out.println("Enter the Vector B values:");
        for (int i = 0; i < vectorB.length; i++) {
            System.out.print("Enter a number: ");
            vectorB[i] = sc.nextInt();
        }

        int[] vectorAB = new int[number];

        System.out.println("VECTOR AB:");
        for (int i = 0; i < vectorAB.length; i++) {
            vectorAB[i] = vectorA[i] + vectorB[i];
        }

        for (int v : vectorAB) {
            System.out.println(v);
        }

        sc.close();
    }
}
