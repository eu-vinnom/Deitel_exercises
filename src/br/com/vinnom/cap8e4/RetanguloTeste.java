package br.com.vinnom.cap8e4;

public class RetanguloTeste
{

  public static void main( String[] args )
  {
    Retangulo r1 = new Retangulo();
    Retangulo r2 = new Retangulo();
    
    System.out.println( "Criando r1" );
    r1.setComprimento( 5 );
    r1.setLargura( 12 );
    
    System.out.println( "Criando r2" );
    r2.setComprimento( -12 );
    r2.setLargura( 27 );
    
    System.out.println( "Perimetro de r1: " + r1.calculaPerimetro() );
    System.out.println( "Area de r1: " + r1.calculaArea() );
    
    System.out.println( "Perimetro de r2: " + r2.calculaPerimetro() );
    System.out.println( "Area de r2: " + r2.calculaArea() );

  }

}
