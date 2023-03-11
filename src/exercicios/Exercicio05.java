package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//		Crie um programa que receba um valor inteiro informado pelo usuário e determine se esse valor é umnúmero primo.
//		Observe que os números primos são aqueles que são divisíveis apenas por elespróprios e por 1.
public class Exercicio05 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Valor que deseja verificar de é primo");
		int numPrimo = scanner.nextInt();
		boolean valorPrimo = verificaValorPrimo(numPrimo);

		if (!valorPrimo){
			System.out.println("É um numero primo: "+ numPrimo);
		} else {
			System.out.println("Não é um numero primo: "+ numPrimo);
		}
	}

	private static boolean verificaValorPrimo(int num) {
		boolean valorPrimo = false;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				valorPrimo=true;
				break;
			}
		}
		return valorPrimo;
	}
}

