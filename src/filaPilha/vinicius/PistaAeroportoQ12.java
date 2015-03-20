package Ex12;

import PilhaFila.EstruturaFila;

public class PistaAeroporto {
	public static void main(String[] Args) {
		String[] v = new String[20];
		int tamMax = 20;
		EstruturaFila f = new EstruturaFila(tamMax);
		Avi�o a = new Avi�o();

		a.modelo(v);

		for (int i = 0; i < tamMax; i++) {
			try {
				f.enfileirar(v[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			f.desenfileirar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			f.enfileirar("SeaStar");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < f.item.length; i++){
			System.out.println("Os modelos de avi�es na fila de espera s�o : " + f.item[i]);
		}
		
		System.out.println("O modelo do primeiro avi�o � : " + f.item[f.frente]);
		
	}

}
