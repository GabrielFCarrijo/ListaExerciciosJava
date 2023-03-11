package exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double alicota = 0;
		double deducao = 0;

		System.out.println("Digite o salario: ");
		double salario = scanner.nextDouble();

		if (salario < 1212.00) {
			alicota = 7.50;
			deducao = 0.00;

			double calc = (salario * (alicota / 100)) - deducao;
			double valorFinalSalario = salario - calc;
			imprimeValores(alicota, salario, calc, valorFinalSalario);
		} else if (salario >= 1212.01 || salario <= 2427.35 ) {
			//			Valor INSS = (salário * % alíquota) -  dedução.

			alicota = 9.00;
			deducao = 18.18;

			double calc = (salario * (alicota / 100)) - deducao;
			double valorFinalSalario = salario - calc;
			imprimeValores(alicota, salario, calc, valorFinalSalario);

		} else if (salario >= 2427.36 || salario <= 3641.03 ) {

			alicota = 12.00;
			deducao = 91.00;

			double calc = (salario * (alicota / 100)) - deducao;
			double valorFinalSalario = salario - calc;
			imprimeValores(alicota, salario, calc, valorFinalSalario);

		} else if (salario >= 3641.03 || salario <= 7027.22 ) {

			alicota = 14.00;
			deducao = 163.82;

			double calc = (salario * (alicota / 100)) - deducao;
			double valorFinalSalario = salario - calc;
			imprimeValores(alicota, salario, calc, valorFinalSalario);

		}
		scanner.close();
	}

	private static void imprimeValores(double alicota, double salario, double calc, double valorFinalSalario) {
		System.out.println("------------------------");
		System.out.println("Calculadora de INSS");
		System.out.println("------------------------");
		System.out.println("Salario Bruto: " + salario);
		System.out.println("Valor da Alicota: " + alicota + "%");
		System.out.println("Desconto INSS: " + calc);
		System.out.println("Salario com descontos: " + valorFinalSalario);
		System.out.println("-------------------------");
	}
}
