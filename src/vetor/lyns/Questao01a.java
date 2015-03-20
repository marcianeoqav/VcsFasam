package vetor.lyns;
import javax.swing.*;
/*1 Escrever um programa na linguagem de programa��o Java para instanciar, preencher e
imprimir um vetor de 10 posi��es, cujo conte�do s�o n�meros inteiros;
1.1 instru��es para solu��o:
1.1.1 Implementar somente uma classe Java contendo tr�s m�todos, descritos a
seguir:
1.1.1.1 um m�todo para preencher o vetor. Este m�todo n�o dever� retornar nada
(void);
1.1.1.2 um m�todo para imprimir o vetor. Este m�todo n�o dever� retornar nada
(void);
1.1.1.3 um m�todo main para instanciar o vetor e chamar os outros dois m�todos.
*/

public class Questao01a {
	

    public static void main(String[] args) {  
        int[] vetor = new int[10];  
          
        int ultimo;  
        for (ultimo = 0; ultimo < vetor.length; ultimo++) {  
            String texto = JOptionPane.showInputDialog("Informe o valor " + (ultimo+1) + ": ");  
            if (texto == null || texto.isEmpty())  // cancelar  
                break;  
              
            int numero = Integer.parseInt(texto);   
              
                        
            vetor[ultimo] = numero;  
      
        }
        
    }
}
	
    
