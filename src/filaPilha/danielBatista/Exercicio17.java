package ListaPilhaFila3;

import javax.swing.JOptionPane;

import ListaPilhaFila3.Fila2;
import ListaPilhaFila3.Pilha1;

public class Exercicio17 {

	public static Pilha1 p1 = new Pilha1(20);
	public static Fila2 numpares;
	public static Fila2 numimpares;

	public static void main(String[] args){
		int numero = 1;
		while(numero > 0){
			try{
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para inserir na Pilha:\n Para finalizar digite um numero <= 0."));
				if (numero > 0){
					p1.empilhar(numero);
				}	
			} 
			catch (NumberFormatException e){
				//JOptionPane.showMessageDialog(null, "O valor inserido é inválido.", "PRESTENÇÃO!", JOptionPane.WARNING_MESSAGE);
			} 
		}
		int aux[] = new int[p1.topo()];
		numpares = new Fila2(aux.length);
		numimpares = new Fila2(aux.length);
		
		System.out.print("Pilha:\n");
		for (int i = 0; i < aux.length; i++){
			aux[i] = (int) p1.desempilhar();
			System.out.print(aux[i] + "\t");
		}
		System.out.print("\n\n");
		
		int contpar = 0;
		int contimpar = 0;
		for (int j = 0; j < aux.length; j++){
			if (aux[j] % 2 == 0){
				numpares.enfileirar(aux[j]);
				contpar++;
			}else{
				numimpares.enfileirar(aux[j]);
				contimpar++;
			}
		}
		if (numpares.vazia()){
			System.out.print("fila pares vazia!\n\n");
		}else{
			System.out.print("Fila de números pares:\n");
			for (int k = 0; k < contpar; k++){
				try {
					System.out.print(numpares.desenfileirar() + "\t");
				} 
				catch (Exception e){
					e.printStackTrace();
				}
			}
			System.out.print("\n\n");
		}
		if (numimpares.vazia()){
			System.out.print("fila ímpares vazia!\n\n");
		}else{
			System.out.print("Fila de números ímpares:\n");
			for (int l = 0; l < contimpar; l++){
				try{
					System.out.print(numimpares.desenfileirar() + "\t");
				} 
				catch (Exception e){
					e.printStackTrace();
				}
			}
			System.out.print("\n\n");
		}		
	}
}
