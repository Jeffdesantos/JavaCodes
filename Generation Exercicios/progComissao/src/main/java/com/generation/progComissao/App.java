package com.generation.progComissao;

import java.util.Scanner;

/**
 * programa de calculo de comissao
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//criando objeto que recebe os dados do console
    	Scanner reader = new Scanner(System.in);
    	
    	//criando as variáveis
    int idVendedor, idPeca, quant = 0;
    float preco, valorComissao = 0;
    double total = 0;
    	
    	//pegando os dados do usuario
        System.out.println( "Digite a identificacao do vendedor:" );
        idVendedor = reader.nextInt();
        
        System.out.println( "Digite a identificacao do produto:" );
        idPeca = reader.nextInt();
        
        System.out.println( "Digite o preco da unidade da peca:" );
        preco = reader.nextFloat();
        
        System.out.println( "Digite a quantidade de pecas vendida:" );
        quant = reader.nextInt();
        
        
        //calculo do valor da comissao
        total = (preco * quant)* 0.05;
        
        System.out.println( "O valor da comissao é " + total );
    }
}
