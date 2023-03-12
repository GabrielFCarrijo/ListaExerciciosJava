package exercicios.exercicio9;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        double taxaSelic = 0.02;
        double capital = 1000;

        double taxaRendimentoA = 0.85 * taxaSelic;
        double taxaAdministrativaA = 0.1;
        double rendimentoA = 0;
        double descontosA = 0;
        double rendimentoLiquidoA = 0;

        double taxaRendimentoB = 0.93 * taxaSelic;
        double taxaAdministrativaB = 0.01;
        double impostoRendimentoB = 0.06;
        double rendimentoB = 0;
        double descontosB = 0;
        double rendimentoLiquidoB = 0;

        DecimalFormat df = new DecimalFormat("#.##");

        BancosCDBS cdbs = new BancosCDBS();

        cdbs.calcRendMensal(taxaSelic, capital, taxaRendimentoA, taxaAdministrativaA, df);

        for (int mes = 1; mes <= 12; mes++) {
            rendimentoA = capital * taxaRendimentoA;
            descontosA = rendimentoA * taxaAdministrativaA;
            rendimentoLiquidoA = rendimentoA - descontosA;
            capital += rendimentoLiquidoA;
            System.out.println(mes + "\tR$ " + df.format(capital) + "\tR$ " + df.format(rendimentoLiquidoA) + "\tR$ " + df.format(capital));
        }

        cdbs.mostraRendimentos(capital, descontosA, df);
        capital = 1000;

        cdbs.taxaRendiemntoB(taxaRendimentoB, taxaAdministrativaB, impostoRendimentoB, df);
        for (int mes = 1; mes <= 12; mes++) {
            rendimentoB = capital * taxaRendimentoB;
            descontosB = rendimentoB * taxaAdministrativaB;
            rendimentoLiquidoB = rendimentoB - descontosB;
            capital += rendimentoLiquidoB;
            System.out.println(mes + "\tR$ " + df.format(capital) + "\tR$ " + df.format(rendimentoLiquidoB) + "\tR$ " + df.format(capital));
        }
        cdbs.mostraRendimentos(capital, descontosB, df);
        capital = 1000;


    }
}
