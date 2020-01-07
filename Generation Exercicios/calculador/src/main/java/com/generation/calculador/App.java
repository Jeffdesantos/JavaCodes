package com.generation.calculador;

import java.util.Scanner;

/**
 * Calculadora
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner reader = new Scanner(System.in);
    	
    int i = 0;
    float num1, num2, resultado = 0;
    
        System.out.println("\n--------Calculadora--------\n\n");
        System.out.println("\n--------Escolha a operação--------\n\n");
        System.out.println("1 Adição");
        System.out.println("2 Subtração");
        System.out.println("3 Multiplicação");
        System.out.println("4 Divisão");
        System.out.println("0 Sair");
        i = reader.nextInt();
        
       do {
        switch(i) {
        case 1:
        	System.out.println("Vamos fazer a Soma");
        	System.out.println("Digite o primeiro valor:");
        	num1 = reader.nextFloat();
        	System.out.println("Digite o segundo valor:");
        	num2 = reader.nextFloat();
        	        	
        	resultado = num1 + num2;
        	System.out.println("\nA soma de " + num1 + " e " + num2 + " é: " + resultado);
        	i = 0;
        	break;
        case 2:
        	System.out.println("Vamos fazer a Subtração");
        	System.out.println("Digite o primeiro valor:");
        	num1 = reader.nextFloat();
        	System.out.println("Digite o segundo valor:");
        	num2 = reader.nextFloat();
        	
        	resultado = num1 - num2;
        	System.out.println("\nA subtração de " + num1 + " e " + num2 + " é: " + resultado);
        	i = 0;
        	break;
        case 3:
        	System.out.println("Vamos fazer a Multiplicação");
        	System.out.println("Digite o primeiro valor:");
        	num1 = reader.nextFloat();
        	System.out.println("Digite o segundo valor:");
        	num2 = reader.nextFloat();
        	
        	resultado = num1 * num2;
        	System.out.println("\nA multiplicação de " + num1 + " e " + num2 + " é: " + resultado);
        	i = 0;
        	break;
        case 4:
        	System.out.println("Vamos fazer a Divisão");
        	System.out.println("Digite o primeiro valor:");
        	num1 = reader.nextFloat();
        	System.out.println("Digite o segundo valor:");
        	num2 = reader.nextFloat();
        	
        	resultado = num1 / num2;
        	System.out.println("\nA divisão de " + num1 + " e " + num2 + " é: " + resultado);
        	i = 0;
        	break;
        	
        default:
        	System.out.println("opção inválida!");
        	i = 0;
        	break;
        	
        }
       }while(i != 0);
       
       if(i == 0) {
    	   System.out.println("---------Programa encerrado!---------");
       }
    }
}
