package exercicios;

//Sejam as amostras de tamanho n=5, X={2,7,4,3,2} e Y={1,2,3,6,5}, realize os seguinte cálculos,conforme:

public class Exercicio08 {

	double[] x = { 2, 7, 4, 3, 2 };
	double[] y = { 1, 2, 3, 6, 5 };
	public static void main(String[] args) {


	}

	public int a() {
		int resultado = 0;
		for (int j = 0; j < 5; j++) {
			resultado += x[j];
		}
		return resultado;
	}

	public int b() {
		int resultado = 0;
		for (int j = 0; j < 5; j++) {
			resultado += (x[j] * y[j]);
		}
		return resultado;
	}

	public int c() {
		int resultado = 0;
		for (int j = 1; j < 4; j++) {
			resultado += x[j] * (y[j] * y[j]);
		}
		for (int j = 0; j < 5; j++) {
			resultado += 3;
		}
		return resultado;
	}
}
