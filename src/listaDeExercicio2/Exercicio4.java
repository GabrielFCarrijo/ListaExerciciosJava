package listaDeExercicio2;

import java.util.Scanner;

public class Exercicio4 {
    // Construa um programa que armazene 15 número sem um vetor e imprima uma lista enumerada contendo o número e uma
    // das mensagens:par ou ímpar

    public static void main(String[] args) {
        int[] valores = new int[15];

        Scanner scanner = new Scanner(System.in);

        leValores(valores, scanner);
        verificaValoresSaoImparOuPar(valores);
    }

    private static void verificaValoresSaoImparOuPar(int[] valores) {
        for (int i =1; i<=14; i++) {
            int imparPar = valores[i] % 2;

            if (imparPar == 1) {
                System.out.println("Valor " + valores[i] + " é Impar");
            } else if (imparPar == 0) {
                System.out.println("Valor " + valores[i] + " é Par");
            }
        }
    }

    private static void leValores(int[] valores, Scanner scanner) {
        for (int i = 1; i <= 14; i++) {
            System.out.print(i + " armazene valor : ");
            valores[i] = scanner.nextInt();
        }
    }
}
