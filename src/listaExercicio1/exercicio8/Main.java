package listaExercicio1.exercicio8;

public class Main {
        
	public static void main(String[] args) {

        double[] x = { 2, 7, 4, 3, 2 };
        double[] y = { 1, 2, 3, 6, 5 };
        
        Somatoria somas = new Somatoria();
    
    	System.out.println(somas.contaA(x));
        System.out.println(somas.contaB(x, y));
        System.out.println(somas.contaC(x, y));
   
    }
}
