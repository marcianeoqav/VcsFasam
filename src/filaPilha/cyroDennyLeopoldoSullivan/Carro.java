/*	Classe utilitária para os exercícios 19 e 20 da lista de filas e pilhas. */

package listaExerciciosN203FilasPilhas;

public class Carro 
{
	private String placa;
	private int manob = 0;
		
	public int getManob() 
	{
		return manob;
	}
	
	public void setManob() 
	{
		this.manob++;
	}

	public String getPlaca() 
	{
		return placa;
	}

	public void setPlaca(String placa) 
	{
		this.placa = placa;
	}

}
