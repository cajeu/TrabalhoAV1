package exercicios1;

import java.util.Scanner;

public class Ex3Nome {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o nome:");
		String nome = leia.next();
		System.out.println("Digite o sobrenome:");
		String sobrenome = leia.next();
		
		System.out.println(nome + " " + sobrenome);
		
		leia.close();
	}

}
