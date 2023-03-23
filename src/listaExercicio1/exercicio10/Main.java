package listaExercicio1.exercicio10;

import java.util.Scanner;

public class Main {

//    Uma venda de alimentos precisa contabilizar suas vendas. Para tanto, crie um programa que solicite ousuário o informe de 10 vendas. V
//    A cada venda deverá ser informado:codigo produto, valor unitarioequantidade. Use uma classe para representar a Venda. V
//    O programa deverá:
//    a.A cada venda informada mostrar o valor total (quantidade * valor unitario);V
//    b.Valor médio vendido;
//    c.Mostrar o código do produto, quantidade e valor total do produto com maior venda;
//    d.Mostrar o código do produto, quantidade e valor total do produto com menor venda;
//    e.Mostrar o valor Total Vendido;
//    f.Mostrar a quantidade total de itens vendidos;

    public static void main(String[] args) {

        Vendas vendas = new Vendas();

        int i;
        int maisVendido =0;
        int menosVendido=100000;
        double valorTotalVendido =0;
        int totalItensVendidos = 0;
        int[] quantidade = new int[10];
        double[] valorUnit  = new double[10];
        int[] codProduto = new int[10];
        double[] valorTotal  = new double[10];
        double valorMedio;


        for (i=1; i < 10; i++) {
            Scanner sc = new Scanner(System.in);

            vendas.leDezCompras(i, quantidade, valorUnit, codProduto, sc);
            vendas.calculaValorTotal(i, quantidade, valorUnit, valorTotal);
            System.out.println("----------------------------------");

        }

        vendas.maiorMenorVenda(maisVendido, menosVendido, quantidade, codProduto, valorTotal);

        for (i=1; i<10; i++) {
            valorTotalVendido += valorTotal[i];
            totalItensVendidos = quantidade[i];
        }

        valorMedio = valorTotalVendido / totalItensVendidos;

        System.out.println("Valor Total itens vendidos: " + valorTotalVendido);
        System.out.println("Quantidade Total itens vendidos: " + totalItensVendidos);
        System.out.println("Valor medio vendido: " + valorMedio);
    }

}
