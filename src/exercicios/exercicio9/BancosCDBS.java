package exercicios.exercicio9;

import java.text.DecimalFormat;

public class BancosCDBS {

    public static void taxaRendiemntoB(double taxaRendimentoB, double taxaAdministrativaB, double impostoRendimentoB, DecimalFormat df) {
        System.out.println("Investimento B: CDB Fura Bolso");
        System.out.println("Taxa de rendimento: " + df.format(taxaRendimentoB * 100) + "%");
        System.out.println("Taxa administrativa: " + df.format(taxaAdministrativaB * 100) + "%");
        System.out.println("Imposto sobre o rendimento: " + df.format(impostoRendimentoB * 100) + "%");
        System.out.println();
        System.out.println("Mês\tCapital\t\tRendimento\tTotal");
    }

    public static void mostraRendimentos(double capital, double descontosA, DecimalFormat df) {
        System.out.println("Rendimento Total: R$ " + df.format(capital - 1000));
        System.out.println("Descontos: R$ " + df.format(descontosA * 12));
        System.out.println("Rendimento Líquido: R$ " + df.format(capital - 1000 - descontosA * 12));
        System.out.println();
    }

    public static void calcRendMensal(double taxaSelic, double capital, double taxaRendimentoA, double taxaAdministrativaA, DecimalFormat df) {
        System.out.println("Taxa Selic: " + df.format(taxaSelic * 100) + "%");
        System.out.println("Capital investido: R$ " + df.format(capital));
        System.out.println();
        System.out.println("Investimento A: CDB Banco Pague Mais");
        System.out.println("Taxa de rendimento: " + df.format(taxaRendimentoA * 100) + "%");
        System.out.println("Taxa administrativa: " + df.format(taxaAdministrativaA * 100) + "%");
        System.out.println();
        System.out.println("Mês\tCapital\t\tRendimento\tTotal");
    }
}
