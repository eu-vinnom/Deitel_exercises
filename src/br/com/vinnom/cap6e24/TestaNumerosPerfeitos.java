package br.com.vinnom.cap6e24;

public class TestaNumerosPerfeitos
{
	public static void main( String[] args )
	{
		ePerfeito();
	}
	
	static void ePerfeito()
	{
		int soma;
		for( int i = 1; i <= 1000; i ++ )
		{
			soma = 0;
			for( int j = 1; j <= i / 2; j ++ )
			{
				if( i % j == 0 )
				{
					soma += j;
				}
			}
			if( soma == i )
			{
				System.out.println(  i + " é um número perfeito" );
				System.out.println( "Divisores de " + i );
				for( int j = 1; j <= i / 2; j ++ )
				{
					if( i % j == 0 )
					{
						System.out.printf( "%d ", j );
					}
				}
				System.out.println(  );
			}
		}
	}
}
