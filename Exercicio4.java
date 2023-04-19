package Collections;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num;
		Set<Integer> numero = new HashSet<Integer>();
		
		numero.add(2);
		numero.add(5);
		numero.add(1);
		numero.add(3);
		numero.add(4);
		numero.add(9);
		numero.add(7);
		numero.add(8);
		numero.add(10);
		numero.add(6);
		
		System.out.println("\nDigite o Número que você deseja encontrar: ");
		num = ler.nextInt();
		
		if(numero.contains(num)){
					
		System.out.println("\nO número "+num+" foi encontrado!");
		
	}
		else {
			System.out.println("\nO número "+num+ " não foi encontrado");
	}
	
}
}