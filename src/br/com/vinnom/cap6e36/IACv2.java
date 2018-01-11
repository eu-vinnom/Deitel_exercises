package br.com.vinnom.cap6e36;

import java.util.Random;
import java.util.Scanner;

public class IACv2
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
			mensagemAcerto();
		}
		else if( produtoUsuario != produtoReal && produtoUsuario != -1 )
		{
			do
			{
				teste = resultado.ERRADO;
				mensagemErro();
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
					mensagemAcerto();
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

	private static void mensagemErro()
	{
		int erro = 1 + aleatorio.nextInt( 4 );

		switch( erro )
		{
			case 1 :
				System.out.println( "Não. Por favor tente de novo." );
				break;
			case 2 :
				System.out.println( "Errado. Tente outra vez." );
				break;
			case 3 :
				System.out.println( "Não desista!" );
				break;
			case 4 :
				System.out.println( "Não. Continue tentando." );
				break;
		}
	}

	private static void mensagemAcerto()
	{
		int acerto = 1 + aleatorio.nextInt( 4 );

		switch( acerto )
		{
			case 1 :
				System.out.println( "Muito bom!" );
				break;
			case 2 :
				System.out.println( "Excelente!" );
				break;
			case 3 :
				System.out.println( "Ótimo trabalho!" );
				break;
			case 4 :
				System.out.println( "Continue com o ótimo trabalho!" );
				break;
		}
	}

	private static int numeroAleatorio()
	{
		return aleatorio.nextInt( 10 );
	}
}
