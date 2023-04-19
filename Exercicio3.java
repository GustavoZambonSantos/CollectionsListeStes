package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Set<Integer> numero = new HashSet<Integer>();
		int num;
		for(int x=0;x<10;x++) 
		{
		System.out.println("\nDigite um número: ");
		num = ler.nextInt();
			numero.add(num);
			}
		System.out.println("\nNúmero Digitados      "+numero);
	
		System.out.println("\nListar dados do set");
		System.out.println(numero);
		
		
		Iterator<Integer> number = numero.iterator();

	}

}
