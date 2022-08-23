package arrays1;

import java.util.Locale;
import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        double[] vector = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Height " + (i + 1) +": ");
            vector[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vector[i];
        }

        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT: %.2f", avg);
        sc.close();
    }
}
