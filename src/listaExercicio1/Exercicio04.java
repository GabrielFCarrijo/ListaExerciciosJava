package listaExercicio1;

//Crie um programa que receba um número inteiro n e leia n valores do teclado e compute
// quantos destes valores são negativos.

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countNumNeg=0;

        System.out.printf("Qual quatidade de numeros que deseja: ");
        int n = scanner.nextInt();
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < n; i++) {

            Integer[] array = new Integer[n];

            System.out.println("Qual valor deseja colocar na posição " + i + " :");
            array[i] = scanner.nextInt();
            System.out.println("------------------------------------------------");

            if (array[i] < 0) {
                countNumNeg++;
            }
        }

        System.out.println("Quantidade de valores negativos: " + countNumNeg);
        scanner.close();
    }
}
