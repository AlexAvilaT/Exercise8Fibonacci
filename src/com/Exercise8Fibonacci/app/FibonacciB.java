package com.exercise7Arrays.app;

import java.util.Scanner;

public class fibonacci2 
{


	public static void main(String[] args)
	{
		//Ejercicio en clase 
		//constant declaration
				long fibonacci=1;
				int cont=0;
				int cont2=2;
				int bound=0;
				
				Scanner input = new Scanner(System.in);
				
				do
				{
					System.out.println("¿Cuantos fibonaccis deseas calcular?");
					bound = input.nextInt();
					if(bound<=0);
					{
						System.out.println("debes introducir un numero mayor a cero");
					}
				} 
				while(bound<=0);
				for(int i=0; i<bound; i++)
				{
					System.out.print(fibonacci+"");
					fibonacci = cont+cont2;
					cont=cont2;
					cont2=(int) fibonacci;
				}
	}			
}