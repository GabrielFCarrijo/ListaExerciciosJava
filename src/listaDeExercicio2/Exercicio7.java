package listaDeExercicio2;
import java.util.Scanner;
import java.util.logging.Logger;

public class Exercicio7 {

    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para definir tamanho da sequencia: ");
        n = scanner.nextInt();

        if (n == 0 || n == 1 || n == 2) {
            System.out.println("COMEÇA EM 2 SEU BURRO");
        }

        Integer[] seq = new Integer[n];

        seq[0] = 0;
        seq[1] = 1;
        for (int i = 2; i < n; i++) {
            seq[i] = seq[i - 1] + seq[i - 2];
        }

         for (int i = 0; i < n; i++) {
             System.out.print(seq[i] + " ");
         }
    }
}
