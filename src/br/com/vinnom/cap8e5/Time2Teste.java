package br.com.vinnom.cap8e5;

public class Time2Teste
{

  public static void main( String[] args )
  {
    Time2Default time2Default = new Time2Default( 5, 12, 15 );
    Time2New time2New = new Time2New( 5, 12, 15 );

    System.out.println( "time2default: " + time2Default.toUniversalFormat() );
    System.out.println( "time2new: " + time2New.toUniversalFormat() );

  }

}
