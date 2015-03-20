package processual03;


public class Carro 
{
	private String placa;
	private int manobra = 0;
		
	public int getmanobra() 
	{
		return manobra;
	}
	
	public void setmanobra() 
	{
		this.manobra++;
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
