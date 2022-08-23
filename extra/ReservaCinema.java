package extra;

import java.util.Scanner;

public class ReservaCinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] cinema = new char[10][10];
        int poltrona, fila;
        char opcao;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                cinema[i][j] = 0;
            }
        }
        do {
            System.out.println("Selecione a opção desejada:");
            System.out.println("1 - Reservar");
            System.out.println("2 - Layout do Cinema");
            System.out.println("3 - Sair");

            System.out.println();
            System.out.print("Opção: ");
            opcao = sc.next().charAt(0);
            System.out.println();

            switch (opcao) {
                case '1':
                    System.out.print("Fila: ");
                    fila = sc.nextInt();
                    System.out.print("Poltrona: ");
                    poltrona = sc.nextInt();

                    if (cinema[fila - 1][poltrona - 1] == 0) {
                        cinema[fila - 1][poltrona - 1] = 'X';
                        mostrarSala(cinema);
                        System.out.println();
                    } else {
                        System.out.println("Poltrona Já ocupada!");
                        System.out.println();
                    }
                    break;

                case '2':
                    mostrarSala(cinema);
                    System.out.println();
                    break;
            }

        } while (opcao != '3');

        sc.close();
    }

    public static void mostrarSala(char[][] sala) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + sala[i][j] + " ");
            }
            System.out.println();
        }
    }
}
