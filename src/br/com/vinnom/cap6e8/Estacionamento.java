package br.com.vinnom.cap6e8;

public class Estacionamento
{
	private static final double periodoBasico = 2;
	private static final double adicional = 0.5;
	private static final double valorMaximo = 10;
	private int periodo;
	
	public int getPeriodo()
	{
		return periodo;
	}
	public void setPeriodo( int periodo )
	{
		this.periodo = periodo;
	}
	
	public double calculaConta( double periodo )
	{
		if( periodo <= 3 )
		{
			return periodoBasico;
		}
		if( periodo > 3 && periodo < 16 )
		{
			return ( periodoBasico + periodo * adicional );
		}
		if( periodo >= 16 )
		{
			return valorMaximo;
		}
		return 0;
	}
}
