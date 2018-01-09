package br.com.vinnom.cap6e8;

import java.util.Scanner;

public class TestaEstacionamento
{
	public static void main( String[] args )
	{
		Estacionamento estacionamento = new Estacionamento();
		
		double periodoCliente1, periodoCliente2, periodoCliente3;
		double receita;
		
		Scanner entrada = new Scanner( System.in );
		
		System.out.println( "Entre com periodo do primeiro cliente" );
		periodoCliente1 = entrada.nextInt();
		System.out.println( "Total a pagar do primeiro cliente: $" + estacionamento.calculaConta( periodoCliente1 ) );
		
		System.out.println( "Entre com periodo do segundo cliente" );
		periodoCliente2 = entrada.nextInt();
		System.out.println( "Total a pagar do segundo cliente: $" + estacionamento.calculaConta( periodoCliente2 ) );
		
		System.out.println( "Entre com periodo do terceiro cliente" );
		periodoCliente3 = entrada.nextInt();
		System.out.println( "Total a pagar do terceiro cliente: $" + estacionamento.calculaConta( periodoCliente3 ) );
		
		receita = estacionamento.calculaConta( periodoCliente1 ) + estacionamento.calculaConta( periodoCliente2 ) + estacionamento.calculaConta( periodoCliente3 );
		System.out.println( "A receita deste dia é igual a: $" + receita );
		
		entrada.close();
	}
}
