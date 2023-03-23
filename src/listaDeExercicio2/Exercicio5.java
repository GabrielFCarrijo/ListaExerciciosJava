package listaDeExercicio2;

import java.util.Scanner;

public class Exercicio5 {

    //Construa um programa que permita armazenar o salário de 20 pessoas.
    // Calcular e armazenar o novo salário sabendo-se que o reajuste foi de 8%.
    // Imprimir uma lista numerada contendo:salário antigo, novo salário,diferença em valor;
    // ao final mostre o total de cada coluna (vetor).Declarequantosvetoresforemnecessários.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salariosAntigos = new double[20];
        double[] salariosNovos = new double[20];
        double[] calcDiferenca = new double[20];

        leValores(scanner, salariosAntigos);
        comparaSalarios(salariosAntigos, salariosNovos, calcDiferenca);

    }

    private static void leValores(Scanner scanner, double[] salariosAntigos) {
        for (int i = 0; i < 20; i++) {
            System.out.print(i + " digite o valor do salario: ");
            salariosAntigos[i] = scanner.nextDouble();
        }
    }

    private static void comparaSalarios(double[] salariosAntigos, double[] salariosNovos, double[] calcDiferenca) {
        for (int i = 0; i < 20; i++) {
            salariosNovos[i] = salariosAntigos[i] + (salariosAntigos[i] * 8 / 100);
            calcDiferenca[i] = salariosNovos[i] - salariosAntigos[i];

            System.out.println(i + " Salario Antigo -> " + salariosAntigos[i] + " Salario novo calculado -> "
                    + salariosNovos[i] + " Diferença dos salarios apos aplicado o calculo -> " + calcDiferenca[i]);
        }
    }
}
