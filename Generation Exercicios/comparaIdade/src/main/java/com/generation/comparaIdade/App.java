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
    	
    	
int i,f,x = 0;
        System.out.println( "Digite sua idade:" );
        Scanner sn = new Scanner(System.in);
        i = sn.nextInt();
        
        System.out.println( "Digite a idade da sua mãe:" );
        f = sn.nextInt();
        
        x = f - i;
        
        System.out.println("Minha mãe é "+ x +" mais velha do que eu!");
   
}
}
