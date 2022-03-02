
package arraycomcinco;

/**
 *
 * @author Fabinhu
 */
public class ArrayComCinco {

    
    public static void main(String[] args) {
        
        
        //criandos variaveis do Tipo ARRAY
        double[] notas = {2,3.5,7.2,8,10,7};
        String[] alunos = {"Pedro","Paulo","Jose","Joao","Daniel","Fabiano"};
        
        //testando ARRAYs
        for(int contador = 0;contador < notas.length;contador++ ){
            System.out.println("Posição "+contador+" - Valor - "+notas[contador]);
            System.out.println("Posição "+contador+" - Valor - "+alunos[contador]);
            System.out.println("\n");
        }
  
        //estanciando ARRAY
        double CarregarNotas = new notas[5];
    }

    public ArrayComCinco() {
    }
    
    public void ArrayNotaMedia(){
        for(int contador=0;contador < notas.length;contador++){
            
        }
    }
    public void ArrayNotaMaxima(){
        
    }
    public void ArrayNotaMinima(){
        
    }
    
}
