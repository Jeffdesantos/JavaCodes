package com.generation.loginUsuario;

import java.util.Scanner;

/**
 * Login de um usuario
 *
 */
public class App {
	public static void main( String[] args )
    {

		//Aqui seria a simulação de informações armazenadas em um Banco de Dados
		
String senha = "654123";
String nome = "Jeff";

	

    	Scanner reader = new Scanner(System.in);
    	
        System.out.println( "Login>" );
        nome = reader.nextLine();
        
        System.out.println( "Senha>" );
        senha = reader.nextLine();      
	
        if(nome.equals("Jeff") && senha.equals("654123")) { 
		System.out.println("Login realizado com sucesso!");}
        else{
		System.out.println("Usuário e senha inválido!");}

		
        
		
        	
           	
       
        
	   
	}
}
