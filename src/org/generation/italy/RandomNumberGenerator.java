package org.generation.italy;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		Random randomGenerator = new Random();
		
		System.out.print("Quanto sarà lunga la lista?");
		int n = Integer.parseInt(scanner1.nextLine()); 
		
		int [] lista = new int[n];
//		int lunghezza = lista.length;
//		System.out.println(lista.length);
		
		for(int i = 0; i < lista.length ; i ++) {
			lista[i] = randomGenerator.nextInt(100);
			System.out.println(lista[i]);
			
		}
		
		
		
		
		scanner1.close();

	}

}
