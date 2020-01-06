package com.generation.calculadoraMedia;

import java.util.Scanner;

/**
 * calcular media
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//criando o objeto scanner
    	Scanner reader = new Scanner(System.in);
    	
    	//declarando variaveis
    float min, max, med = 0;
    
        System.out.println( "\n-----Calculadora de Estoque Medio-----\n" );
    
        
        //puxando dados dos usuarios
        System.out.println( "Digite a quantidade minima:" );
        min = reader.nextFloat();
        System.out.println( "Digite a quantidade maxima:" );
        max = reader.nextFloat();
        
        //condição para o maximo nunca ser menor que o minimo
        while (max < min ) {
        	System.out.println( "Digite uma quantidade maxima maior que a Minima:" );
            max = reader.nextFloat();
            
        }
        
        med = (min + max)/2;
        
        System.out.println( "Estoque Medio: " + med );
        
        
        
    }
}
