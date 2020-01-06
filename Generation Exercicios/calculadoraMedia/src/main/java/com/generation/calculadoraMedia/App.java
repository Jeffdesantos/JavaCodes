package com.generation.calculadoraMedia;

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
    	
    float min, max, med = 0;
        System.out.println( "\nCalculadora de Estoque Médio:\n" );
        
        System.out.println( "Digite a quantidade minima:" );
        min = reader.nextFloat();
        System.out.println( "Digite a quantidade máxima:" );
        max = reader.nextFloat();
        
        while (max < min ) {
        	System.out.println( "Digite uma quantidade maior que a Mínima:" );
            max = reader.nextFloat();
            
        }
        
        med = (min + max)/2;
        
        System.out.println( "Estoque Médio: " + med );
        
        
        
    }
}
