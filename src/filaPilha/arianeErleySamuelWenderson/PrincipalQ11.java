package filaPilha.arianeErleySamuelWenderson;

public class PrincipalQ11 {

	public static void main(String[] args) {
		int tamMax = 20;

		EstruturaPilha p = new EstruturaPilha(tamMax);

		try {
			p.empilhar("P");
			p.empilhar("E");
			p.empilhar("R");
			p.empilhar("T");
			p.empilhar("O");
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 2; i++) {
			try {
				p.item[i] = p.desempilhar();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			p.empilhar("S");
			p.empilhar("O");
			p.empilhar("L");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (int i = 2; i < 5; i++) {
			try {
				p.item[i] = p.desempilhar();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < 5; i++){
			System.out.println(p.item[i]);
		}
		
	}

}
