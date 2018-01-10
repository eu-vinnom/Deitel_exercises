package br.com.vinnom.cap6e29;

import java.util.Random;
import java.util.Scanner;

public class CaraECoroa
{
	private enum moeda
	{
		CARA, COROA
	};

	private static int	cara	= 0;
	private static int	coroa	= 0;

	public static void main( String[] args )
	{
		int quantidade = 0;

		Scanner entrada = new Scanner( System.in );

		System.out.println( "Insira a quantidade de vezes que gostaria de jogar a moeda" );
		quantidade = entrada.nextInt();
		entrada.close();

		int i = 0;
		while( i < quantidade )
		{
			joga();
			i ++;
		}
		
		System.out.printf( "Cara\tCoroa\n%d\t%d\n", cara, coroa );

	}

	private static void joga()
	{
		Random random = new Random();
		moeda Face = null;
		switch( random.nextInt( 2 ) )
		{
			case 0 :
				Face = moeda.CARA;
				break;

			case 1 :
				Face = moeda.COROA;
				break;
		}
		if( Face == moeda.CARA )
		{
			cara ++;
		}
		else if( Face == moeda.COROA )
		{
			coroa ++;
		}

	}
}
