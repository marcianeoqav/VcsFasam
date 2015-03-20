package Ex12;

import PilhaFila.EstruturaFila;

public class PistaAeroporto {
	public static void main(String[] Args) {
		String[] v = new String[20];
		int tamMax = 20;
		EstruturaFila f = new EstruturaFila(tamMax);
		Avião a = new Avião();

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
			System.out.println("Os modelos de aviões na fila de espera são : " + f.item[i]);
		}
		
		System.out.println("O modelo do primeiro avião é : " + f.item[f.frente]);
		
	}

}
