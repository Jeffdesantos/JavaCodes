package com.generation.comparaIdade;

import java.util.Scanner;

/**
 * Pegando as idades do usuário e comparando-as
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//criando o objeto
    	Scanner reader = new Scanner(System.in);
    	
    	//declara��o de vari�vel
int idadeFilho, idadeMae, calculo = 0;

		//pegando informa��es do usuario
        System.out.println( "Digite sua idade:" );
        
        idadeFilho = reader.nextInt();
        
        System.out.println( "Digite a idade da sua mae:" );
        idadeMae = reader.nextInt();
        
        //calculo para a diferen�a entre as idades
        calculo = idadeMae - idadeFilho;
        
        System.out.println("Minha mae � "+ calculo +" mais velha do que eu!");
   
}
}
