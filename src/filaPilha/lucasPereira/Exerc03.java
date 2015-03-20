/*Implemente um programa na linguagem de programação java para ler um vetor de inteiros
com 10 posições e um dado valor inteiro x (informado pelo usuário). O programa deverá pesquisar a existência de x no vetor. 
* Se encontrar devolver a posição em que se encontra,caso contrário devolver -1.
        5.1 Implementar apenas uma classe Java contendo os seguintes métodos:
        5.1.1 Um método para preencher os valores do vetor. Este método receberá o vetor como parâmetro, mas não precisa retornar nada;
        5.1.2 Um método para a pesquisa da existência ou não de x no vetor. Este método recebe como parâmetro o vetor e o valor x. 
        *     Deve retornar a posição onde x se enconta no vetor ou -1, caso o valor não conste do vetor;
        5.1.3 Um método main para instanciar o vetor e o valor de x. Chamar o método de pesquisa. 
        *     E apresentar ao usuário um mensagem informando o valor pesquisado e a posição onde se encontra no vetor, 
        *     em caso de sucesso. E uma mensagem informando que o valor não foi encontrado.
 */
package TAD;

import java.util.Scanner;

public class Exerc03 {
    //metodo de pesquisa do objeto	
    public static Object pesquisarValor(Object v1[], Object x) 	// Método de busca. Recebe um vetor e o valor a ser buscado no vetor.
	{
		Object aux = -1;						
		for (int j = 0; j < v1.length; j++){
			if (v1[j] == x){
				aux = j;						
				break;
			}
		}
		return aux;					
	}

    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        
        Fila fila1 = new Fila(10); //vetor de 10 posições
        
        Object x; // declarando uma variavél do qualquer com o tipo vetor 
        
        for(int i = 0; i < fila1.Tamanho(); i++){ //preenchendo os vetor com elementos aleatorios
            fila1.Enfileira(((int) (Math.random() * 20) + 1));
        }
        
        System.out.println("Valores aleatorios da fila: \n\n");
        fila1.ImprimirTodosElementos();
        
        System.out.println("Digite o número que deseja pesquisar:");
        x = in.nextInt();
        
        Object res[] = new Object[fila1.Tamanho()]; //vetor que auxiliara para se fazer a pesquisa
        
        for(int i=0; i< res.length; i++){ //repassa o elemento da fila na mesma ordem.
            try{
                res[i] = fila1.Desenfileira();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        Object resultado = pesquisarValor(res, x);
        
        if (resultado.equals(-1)){
            System.out.println("O numero pesquisado não foi encontrado!");
        }else{
            
            int exibir = (int)(resultado);
            System.out.println("O número "+ x + " foi encontrado na posição "+ (exibir +1));
        }
        
        
        
    }
}
