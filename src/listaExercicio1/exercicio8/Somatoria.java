package listaExercicio1.exercicio8;

public class Somatoria {
    
    public static double contaA(double[] x) {
    
    	double resultado = 0;
        
        for(int i=0; i<5; i++) {
        	resultado += x[i];
        }
        
        return resultado;
     
    }
    
    public static double contaB(double[] x, double[] y) {
    	
        double resultado = 0;
        
        for(int i=0; i<5; i++) {
        	resultado += (x[i] * y[i]);
        }
        
        return resultado;
        
    }
    
    public static double contaC(double[] x, double[] y) {
    
    	double resultado = 0;
        
        for(int i=1; i<4; i++) {
        	resultado += (x[i] * (y[i] * y[i]));
        }
        for(int i=0; i<5; i++) {
        	resultado += 3;
        }
        
        return resultado;
    
    }
    
}