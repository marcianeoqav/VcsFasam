package ListaPilhaFila3;

import ListaPilhaFila3.Fila2;
import ListaPilhaFila3.Pilha1;


public class Exercicio14 {
	public static int seed = 20;
	public static String nomes[] = {"Mauro   ", "Junior  ", "Beatriz   ", "Elisangela    ", "Naiara ", "Joao ", "Doug   ", "Daniel  ", "Jonas    ", "Marcos  "};
	public static Fila2 f1 = new Fila2(5);			
	public static Pilha1 p1 = new Pilha1(5);			
	
	public static String fila = "Nomes da fila:\n";
	public static String pilha = "Nomes da pilha:\n";
	public static String num1[] = new String[p1.tamanho()];					
	public static String num2[] = new String[f1.tamanho()];					
	public static String nomefp = "";							
	

	public static void main(String[] args){
		alimentapilha(p1);											
		System.out.print("Nomes Pilha: \n");		
		p1.imprimeTudo();											

		alimentafila(f1);											
		System.out.print("Nomes Fila: \n");	 
		f1.imprimeTodos();												

		localizaNomefp(p1, f1);						
	}
	public static void alimentapilha(Pilha1 p1){
			int vP[] = new int[p1.tamanho()];				
			for (int j = 0; j < p1.tamanho(); j ++)
			{
				vP[j] = (int) (Math.random() * seed) + 1;			
				for (int k = 0; k < j; k++)
				{
					if (vP[j] == vP[k])							
					{
						j = k = 0;								
					}
				}
			}
			
			for (int c = 0; c < vP.length; c++)
				{
					p1.empilhar(nomes[vP[c]]);						
				}
		}
	public static void alimentafila(Fila2 f1){
		int vetor[] = new int[f1.tamanho()];				
		for (int i = 0; i < f1.tamanho(); i++){
			vetor[i] = (int) (Math.random() * seed) + 1;			
			for (int k = 0; k < i; k++){
				if (vetor[i] == vetor[k]){
					i = k = 0;								 
				}
			}
		}
		for (int p = 0; p < vetor.length; p++){
			f1.enfileirar(nomes[vetor[p]]);  						
		}

	}
	public static void localizaNomefp(Pilha1 p1, Fila2 f1){												
		int contnome = 0;							
		for (int i = 0; i < num1.length; i++){
			try{
				num1[i] = (String) p1.desempilhar();		
				num2[i] = (String) f1.desenfileirar();		
			} 
			catch (Exception e){
				e.printStackTrace();
			}
		}
		for (int l = 0; l < num1.length; l++){
			for (int m = 0; m < num2.length; m++){
				if (num1[l].equals(num2[m]) && ((!num1[l].equals("")) || (!num2[m].equals("")))){
					nomefp = (nomefp + num1[l] + "\t");	
					num1[l] = "";						
					num2[m] = "";						
					contnome++;					  
				}
			}
		}

		switch(contnome){
		case 0:						
			System.out.print("NENHUM NOME FOI ENCONTRADO NAS DUAS ESTRUTURAS!\n");
			break;
		case 1:									
			System.out.print("O NOME QUE ESTÁ NAS DUAS ESTRUTURAS É: \n" + nomefp + "\n");
			break;
		case 4:
			System.out.print("OS NOMES QUE ESTÃO NAS DUAS ESTRUTURAS SÃO: \n" + nomefp + "\n");
			fila = "Nome exibido somente na fila:\n";
			pilha = "Nome exibido somente na pilha:\n";
			break;
		case 5:
			System.out.print("TODOS OS NOMES ESTÃO NAS DUAS ESTRUTURAS: \n" + nomefp + "\n");
			fila = "Nenhum nome é exibido somente na fila.\n";
			pilha = "Nenhum nome é exibido somente na pilha.\n";
			break;
		default:					

			System.out.print("OS NOMES QUE ESTÃO NAS DUAS ESTRUTURAS SÃO: \n" + nomefp + "\n");
			break;
		}
		System.out.print("\n\n" + pilha);		
		for (int n = 0; n < num1.length; n++){
			if (!num1[n].equals("")){
				System.out.print(num1[n] + "\t");								
			}
		}

		System.out.print("\n\n" + fila);
		for (int n = 0; n < num2.length; n++){
			if (!num2[n].equals("")){	
				System.out.print(num2[n] + "\t");								
			}
		}
	}
}