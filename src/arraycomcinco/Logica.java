
package arraycomcinco;

import java.text.DecimalFormat;

/**
 *
 * @author Fabinhu
 */
public class Logica {

    public Logica() {
    }
        //criandos variaveis do Tipo ARRAY
        double[] notas = {2,3.5,7.2,8,10,7};
        String[] alunos = {"Pedro","Paulo","Jose","Joao","Daniel","Fabiano"};
        
         DecimalFormat FormatarDecimal = new DecimalFormat("###,##0.00");
        
    public void ArrayNotaMedia(){
        double somaNotas = 0,mediaNotas=0;
        for(int contador=0; contador < notas.length;contador++){
        somaNotas = somaNotas+notas[contador];
        }
        mediaNotas = somaNotas / notas.length;
        System.out.println("A Media das Notas é "+(FormatarDecimal.format(mediaNotas)));
    }
    public void ArrayNotaMaxima(){
        
    }
    public void ArrayNotaMinima(){
        
    }
    
    public void ArrayVisualizar(){
        //testando ARRAYs
        for(int contador = 0;contador < notas.length;contador++ ){
            System.out.println("Posição "+contador+" - Valor - "+notas[contador]);
            System.out.println("Posição "+contador+" - Valor - "+alunos[contador]);
            System.out.println("\n");
        }
        
    }
    
    
}
