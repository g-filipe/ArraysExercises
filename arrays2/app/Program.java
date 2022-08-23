package arrays2.app;

import arrays2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of products: ");
        int number = sc.nextInt();
        Product[] vector = new Product[number];

        for(int i = 0; i < number; i++){
            sc.nextLine();
            System.out.print("Enter a product name: ");
            String name = sc.nextLine();
            System.out.print("Enter a product price: $ ");
            double price = sc.nextDouble();
            vector[i] = new Product(name, price);
        }

        double sum = 0.0;
        for(int i = 0; i < number; i++){
            sum += vector[i].getPrice();
        }

        double avg = sum / number;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
