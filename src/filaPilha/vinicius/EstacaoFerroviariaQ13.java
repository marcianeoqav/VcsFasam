package Ex13;

import PilhaFila.EstruturaPilha;

public class EstacaoFerroviaria {
	
	public static void main(String [] args){
		int tamMax = 20;
		int[] vetor = new int[6];
		int[] aux = new int[6];
		EstruturaPilha p = new EstruturaPilha(tamMax);
		Vagao v = new Vagao();
		
		v.preencher(vetor);
		
		try {
			p.empilhar(vetor[0]);
			p.empilhar(vetor[1]);
			p.empilhar(vetor[2]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			aux[0] = (Integer) p.desempilhar();
			aux[1] = (Integer) p.desempilhar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			p.empilhar(vetor[3]);
			p.empilhar(vetor[4]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			aux[2] = (Integer) p.desempilhar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			p.empilhar(vetor[5]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			aux[3] = (Integer) p.desempilhar();
			aux[4] = (Integer) p.desempilhar();
			aux[5] = (Integer) p.desempilhar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < 6; i++){
			System.out.print (aux[i] + "  ");
		}
		System.out.println();
		System.out.println("Com a sequência (1, 2, 3, 4, 5, 6) não é possivel gerar a saída (1, 5, 4, 6, 2, 3). Obrigado pela compreensão.");
	}

}
