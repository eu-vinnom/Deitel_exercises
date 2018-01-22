package br.com.vinnom.cap7e10;

import java.util.Random;
import java.util.Scanner;

public class ComissaoVendas
{
	private static final Random	aleatorio			= new Random();
	private static final int		ESCOPO				= 10;
	private static final int		MAX_CONTADOR	= 12;
	private static int					quantidadeVendas;
	private static int[]				salarios;

	public static void main( String[] args )
	{
		Scanner entrada = new Scanner( System.in );

		int[] valorVendas;

		System.out.println( "Quantos salários a serem pagos?" );
		quantidadeVendas = entrada.nextInt();
		valorVendas = new int[ quantidadeVendas ];
		salarios = new int[ quantidadeVendas ];

		for( int i = 0; i < valorVendas.length; i ++ )
		{
			valorVendas[ i ] = geraVendas();
		}

		calculaSalarios( valorVendas );

		mostraTabela();
		entrada.close();
	}

	private static void mostraTabela()
	{
		System.out.println( "\n\nDistribuição dos salários" );

		int[] contador = new int[ MAX_CONTADOR ];

		for( int i = 0; i < salarios.length; i ++ )
		{
			++contador[ salarios[ i ] / 100 ];
		}
		for( int i = 2; i <= ESCOPO; i ++ )
		{
			if( i >= 10 )
			{
				System.out.printf( "%d ou mais: %5d", i * 100, contador[ i ] );
			}
			else
			{
				System.out.printf( "%d-%d: %10d\n", i * 100, i * 100 + 99, contador[ i ] );
			}
		}
	}

	private static void calculaSalarios( int[] valorVendas )
	{
		int SEMANAL = 200;
		double COMISSAO = 0.09;

		for( int i = 0; i < salarios.length; i ++ )
		{
			salarios[ i ] = ( int ) ( valorVendas[ i ] * COMISSAO + SEMANAL );
		}
	}

	private static int geraVendas()
	{
		int valor;
		valor = aleatorio.nextInt( 10000 );
		return valor;
	}
}
