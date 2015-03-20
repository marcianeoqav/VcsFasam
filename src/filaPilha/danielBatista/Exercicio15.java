package ListaPilhaFila3;

import javax.swing.JOptionPane;
import ListaPilhaFila3.Pilha1;

public class Exercicio15 {

	public static Pilha1 p1 = new Pilha1(20);
	public static int aux[];
	
	public static void main(String[] args){
		int opt = -3;
		
		while (opt < 1 || opt > 4){
			try{
				opt = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n1 - Cadastrar um número:\n" + "2 - Mostrar pares:\n" + "3 - Remover um numero:\n4 - Finalizar."));
			}
			catch(NumberFormatException e)
			{
				opt = 10;
			}
			opt = getOption(opt);
		}
	}
	public static int getOption(int x){
		switch(x){
		case 1: 
			if (!p1.cheia()){
				cadnumero();
			}else{
				JOptionPane.showMessageDialog(null, "A pilha está cheia.", "ERRO", JOptionPane.WARNING_MESSAGE);
			}
			x = -3;
			return x;
		case 2:
			if (p1.vazia()){
				System.out.print("Nao tem numero na pilha.\n");
			}else{
				Mostrapares(p1);
			}
			x = -3;
			return x;		
		case 3:
			if (p1.vazia()){
				System.out.print("Nao tem numero para remover.\n");
			}else{
				int rem = (int) p1.desempilhar();
				System.out.print("Removido: " + rem + "\n");
			}
			x = -3;
			return x;
		case 4:
			return x;
		default:
			JOptionPane.showMessageDialog(null, "O valor inserido é inválido.", "PRESTENÇÃO!", JOptionPane.WARNING_MESSAGE);
			return x;
		}
	}
	public static void cadnumero(){
		int x;
		try {
			x = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para cadastrar!"));
			p1.empilhar(x);
			System.out.print("Cadastrado: " + x + "\n");
		} 
		catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null, "O valor inserido é inválido.", "PRESTENÇÃO!", JOptionPane.WARNING_MESSAGE);
		}
	}
	public static void Mostrapares(Pilha1 p1){
		
		int aux[] = new int[p1.topo()];
		Pilha1 restaura = new Pilha1(aux.length);

		for (int r = 0; r < aux.length; r++){
			aux[r] = (int) p1.desempilhar();	
			restaura.empilhar(aux[r]);			
		}
		
		for (int e = 0; e < aux.length; e++){
			p1.empilhar(restaura.desempilhar());
		}
		
		getPares(aux);
	}
	public static void getPares(int[] x){
		int aux[];
		if ((x.length == 1) || (x[x.length - 1] == x[0])){
			System.out.print("So foi adicionado um valor. ");
					
			aux = new int[x.length];
			aux[0] = x[0];
			if (aux[0] % 2 == 0){
				System.out.print("O valor é par: \n" + aux[0] + "\n");
			}else{
				System.out.print("O valor não é par. \n");
			}
		}		
		else if (x[0] > x[x.length - 1]){
			aux = new int[(x[0] - (x[x.length -1]) + 1)];
			for (int w = 0; w < aux.length; w++){
				int z = x[x.length -1];
				aux[w] = z + w;
			}
			System.out.print("Números pares: \n");
			imprimePares(aux);
		}
		else if (x[x.length - 1] > x[0]){
			aux = new int[((x[x.length -1]) - x[0] + 1)];
			for (int w = 0; w < aux.length; w++){
				int z = x[0];
				aux[w] = z + w;
			}
			System.out.print("Números pares: \n");
			imprimePares(aux);
		}
	}
	public static void imprimePares(int[] x)
	{
		int cntRes = 0;
		for (int u = 0; u < x.length; u++)
		{
			if (x[u] % 2 == 0)
			{
				System.out.print(x[u]+ "\t");
				cntRes++;
				if (cntRes >= 10)
				{
					System.out.print("\n");
					cntRes = 0;
				}
			}
		}
		System.out.print("\n\n");
	}

}