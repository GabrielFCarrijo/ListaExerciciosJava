package exercicios.exercicio10;

import java.util.Scanner;

public class Vendas {

    public static void leDezCompras(int i, int[] quantidade, double[] valorUnit, int[] codProduto, Scanner sc) {
        System.out.println("Informe Codigo do produto");
        codProduto[i] = sc.nextInt();

        System.out.println("Informe Valor Unitario do produto");
        valorUnit[i] = sc.nextDouble();

        System.out.println("Informe Quantidade de produtos");
        quantidade[i] = sc.nextInt();
    }

    public static void calculaValorTotal(int i, int[] quantidade, double[] valorUnit, double[] valorTotal) {
        valorTotal[i] = quantidade[i] * valorUnit[i];
        System.out.println("Valor total da compra: " + valorTotal[i]);
    }

    public static void maiorMenorVenda(int maisVendido, int menosVendido, int[] quantidade, int[] codProduto, double[] valorTotal) {
        int i;
        for (i=1; i < 10; i++) {
            if (quantidade[i] > maisVendido) {
                maisVendido = quantidade[i];
            }
            if (quantidade[i] < menosVendido) {
                menosVendido = quantidade[i];
            }
        }

        for (i=1; i < 10; i++) {
            if (quantidade[i] == maisVendido) {
                System.out.println("Produto mais vendido: Codigo Produto " + codProduto[i] + " , Quantidade " + quantidade[i] + " , Valor Total " + valorTotal[i]);
            }
            if (quantidade[i] == menosVendido) {
                System.out.println("Produto menos vendido: Codigo Produto " + codProduto[i] + " , Quantidade " + quantidade[i] + " , Valor Total " + valorTotal[i]);
            }
        }
    }

}
