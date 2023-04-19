package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Exercicio1 {

	public static void main(String[] args) {
		
		String nome;
		Scanner ler = new Scanner(System.in);
		
		ArrayList cores = new ArrayList();
		
		for(int x=0;x<5;x++) 
		{
		System.out.println("\nDigite uma cor: ");
		nome = ler.nextLine();
			cores.add(nome);
			}
		System.out.println("\nListagem de todas as cores: ");
			System.out.println(cores);
		
			Collections.sort(cores);
			System.out.println("\nOrdenando as cores digitadas acima: ");
			System.out.println(cores);
}
}