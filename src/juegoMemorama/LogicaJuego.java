package juegoMemorama;

import java.util.Random;

public class LogicaJuego {
	
	
	//Esto para que las cartas sean ordenadas aleatoriamente en el juego
	 public int[] getCartasNumeros() {
		     
	     int[] numeros = new int[8];
	     int count = 0;
	     
	     while(count < 8) {
	         Random rand = new Random();
	         int numAleatorio = rand.nextInt(4) + 1;
	         int numRepetido = 0;
	            
	         for (int i = 0; i < 8; i++) {
	        	 
	        	 if(numeros[i] == numAleatorio) {
	                 numRepetido++;
	             }
	         }
	         
	         if(numRepetido < 2) {
	             numeros[count] = numAleatorio;
	             count++;
	            }
	            
	        }
	     return numeros;
	 }
}
