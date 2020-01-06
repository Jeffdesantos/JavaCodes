package com.generation.calculadoraDias;

import java.util.Scanner;

/**
 * Calculadora de Idade
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner reader = new Scanner(System.in);
    
    	//declarando as variáveis
    int anos, meses, dias, total = 0;
    	
    	//pegando os dados do usuário
        System.out.println( "Digite os Anos:" );
        anos = reader.nextInt();
        System.out.println( "Digite os Meses:" );
        meses = reader.nextInt();
        System.out.println( "Digite os Dias:" );
        dias = reader.nextInt();
        
        //calculo para o total em dias
        total = (365 + dias) + (365 * anos) + (meses * 30);
        
        System.out.println( "Idade total em dias = " + total);
    }
}
