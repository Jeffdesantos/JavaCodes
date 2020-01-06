package com.generation.progComissao;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner reader = new Scanner(System.in);
    	
    	
    int idVendedor, idPeca, quant = 0;
    float preco, valorComissao = 0;
    double total = 0;
    	
    	
        System.out.println( "Digite a identificação do vendedor:" );
        idVendedor = reader.nextInt();
        
        System.out.println( "Digite a identificação do produto:" );
        idPeca = reader.nextInt();
        
        System.out.println( "Digite o preço unitário da peça:" );
        preco = reader.nextFloat();
        
        System.out.println( "Digite a quantidade de peças vendida:" );
        quant = reader.nextInt();
        
        total = (preco * quant)* 0.05;
        
        System.out.println( "O valor da comissão é " + total );
    }
}
