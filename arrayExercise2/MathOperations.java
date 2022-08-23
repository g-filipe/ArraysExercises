package arrayExercise2;

import java.util.Locale;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;
        double avg = 0.0;

        System.out.print("How many numbers are you gonna enter? ");
        int number = sc.nextInt();

        double[] vector = new double[number];

        for (int i = 0; i < vector.length; i++){
            System.out.print("Enter a number: ");
            vector[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.print("VALUES = ");
        for(int i = 0; i < vector.length; i++){
            System.out.printf("%.1f ", vector[i]);
            sum += vector[i];
        }

        avg = sum / number;

        System.out.printf("\nSUM = %.2f", sum);
        System.out.printf("\nAVERAGE = %.2f",avg);

        sc.close();
    }
}
