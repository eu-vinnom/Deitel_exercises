package br.com.vinnom.cap8e4;

public class Retangulo
{
  private double comprimento;
  private double largura;

  public Retangulo()
  {
    this.comprimento = 1;
    this.largura = 1;
  }

  public double getComprimento()
  {
    return comprimento;
  }

  public double getLargura()
  {
    return largura;
  }

  public void setComprimento( double comprimento )
  {
    if( comprimento > 0.0 && comprimento < 20.0 )
    {
      this.comprimento = comprimento;
    }
    else
    {
      System.out.println( "Não é um valor válido. Configurando como valor padrão 1" );
    }
  }

  public void setLargura( double largura )
  {
    if( largura > 0.0 && largura < 20.0 )
    {
      this.largura = largura;
    }
    else
    {
      System.out.println( "Não é um valor válido. Configurando como valor padrão 1" );
    }
  }

  public double calculaPerimetro()
  {
    return ( getComprimento() * 2 ) + ( getLargura() * 2 );
  }

  public double calculaArea()
  {
    return( getComprimento() * getLargura() );
  }

}
