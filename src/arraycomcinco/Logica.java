
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
        double[] notas = {2,3.5,7.2,8,1.3,7};
        String[] alunos = {"Pedro","Paulo","Jose","Joao","Daniel","Fabiano"};
        
         DecimalFormat FormatarDecimal = new DecimalFormat("###,##0.00");
        
    public void ArrayNotaMedia(){
        double somaNotas = 0,mediaNotas=0;
        
        for(int contador=0; contador < notas.length;contador++){
        somaNotas = somaNotas+notas[contador];
        }
        mediaNotas = somaNotas / notas.length;
        System.out.println("A Media das Notas é "+(FormatarDecimal.format(mediaNotas))+"\n");
        
        /*teste da função
        System.out.println("Total Soma da s Notas: "+somaNotas);
        System.out.println("Quantidade de Notas "+notas.length );
        System.out.println(somaNotas+" / "+notas.length);
        */
    }
    public void ArrayNotaMaxima(){
        double maiorNota=0;
        int indice=0;
        for(int contador=0; contador < notas.length;contador++){
          if(notas[contador] > maiorNota){
              maiorNota = (maiorNota+notas[contador])-maiorNota;
              indice = (indice+contador)-indice;
            }
        } 
        System.out.println("A Maior Nota é "+(FormatarDecimal.format(maiorNota))+ " e pertence ao Aluno "+alunos[indice]+"\n "
                + "Sua Matricula é "+indice+"\n");
                
    }
    public void ArrayNotaMinima(){
        double menorNota=notas[0];
        int indice=0;
        for(int contador=0; contador < notas.length;contador++){
          if(notas[contador] < menorNota){
              menorNota = (menorNota+notas[contador])-menorNota;
              indice = (indice+contador)-indice;
            }
        } 
        System.out.println("A Menor Nota é "+(FormatarDecimal.format(menorNota))+ " e pertence ao Aluno "+alunos[indice]+"\n "
                + "Sua Matricula é "+indice+"\n");
        
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
