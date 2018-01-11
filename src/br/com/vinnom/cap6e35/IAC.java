package br.com.vinnom.cap6e35;

import java.util.Random;
import java.util.Scanner;

public class IAC
{
	private enum resultado
	{
		CERTO, ERRADO, ENCERRA
	};

	private static final Random		aleatorio	= new Random();
	private static final Scanner	entrada		= new Scanner( System.in );

	private static resultado teste = null;

	public static void main( String[] args )
	{
		System.out.println( "Responda a pergunta abaixo. Caso queira encerrar o programa, digite -1" );
		while( teste != resultado.ENCERRA )
		{
			testaProduto();
		}
	}

	private static void testaProduto()
	{
		int num1 = numeroAleatorio();
		int num2 = numeroAleatorio();
		int produtoReal = num1 * num2;
		int produtoUsuario = 0;

		System.out.printf( "Quanto é %d vezes %d?\n", num1, num2 );
		produtoUsuario = entrada.nextInt();

		if( produtoUsuario == produtoReal )
		{
			teste = resultado.CERTO;
			System.out.println( "Muito bom!" );
		}
		else if( produtoUsuario != produtoReal && produtoUsuario != -1 )
		{
			do
			{
				teste = resultado.ERRADO;
				System.out.println( "Não, tente novamente" );
				System.out.printf( "Quanto é %d vezes %d?\n", num1, num2 );
				produtoUsuario = entrada.nextInt();
				if( produtoUsuario == -1 )
				{
					teste = resultado.ENCERRA;
					System.out.println( "O programa foi encerrado!" );
					break;
				}
				else if( produtoUsuario == produtoReal )
				{
					teste = resultado.CERTO;
					System.out.println( "Muito bom!" );
				}
			}	
			while( produtoUsuario != produtoReal && produtoUsuario != -1 );
		}
		else if( produtoUsuario == -1 )
		{
			teste = resultado.ENCERRA;
			System.out.println( "O programa foi encerrado!" );
		}
	}

	private static int numeroAleatorio()
	{
		return aleatorio.nextInt( 10 );
	}
}
