package listaDeExercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {

    // Crie um programa que pergunte três valores distintos e os imprima em ordem crescente.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] valores = new double[3];

        leValores(scanner, valores);
        Arrays.sort(valores);
        printaValores(valores);
    }

    private static void leValores(Scanner scanner, double[] valores) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Adicione os valores: ");
            valores[i] = scanner.nextDouble();
        }
    }

    private static void printaValores(double[] valores) {
        for (int i = 0; i < 3; i++) {
            System.out.println(valores[i]);
        }
    }
}
