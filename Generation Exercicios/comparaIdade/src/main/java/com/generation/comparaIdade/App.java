package com.generation.comparaIdade;

import java.util.Scanner;

/**
 * Pegando as idades do usuÃ¡rio e comparando-as
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//criando o objeto
    	Scanner reader = new Scanner(System.in);
    	
    	//declaração de variável
int idadeFilho, idadeMae, calculo = 0;

		//pegando informações do usuario
        System.out.println( "Digite sua idade:" );
        
        idadeFilho = reader.nextInt();
        
        System.out.println( "Digite a idade da sua mae:" );
        idadeMae = reader.nextInt();
        
        //calculo para a diferença entre as idades
        calculo = idadeMae - idadeFilho;
        
        System.out.println("Minha mae é "+ calculo +" mais velha do que eu!");
   
}
}
