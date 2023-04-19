package Collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Exercicio2 {

	public static void main(String[] args) {
		
		int num;
		int posicao;
		int x;
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList();
		
		numeros.add(2);
		numeros.add(5);	
		numeros.add(1);	
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);	
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("\n\t\tList: ");
		System.out.println(numeros);
		
		System.out.println("\nDigite o número que você deseja Encontrar: ");
		num = ler.nextInt();

		if(numeros.contains(num))
		{
			System.out.println("O número "+num+" está localizado na posição: "+numeros.indexOf(num) );
			
			
		}
		else{
			System.out.println("O número "+num+" não foi encontrado");
		}
		{
			
			
		}
	
	}

}
