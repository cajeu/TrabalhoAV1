package exercicios1;

import java.util.Scanner;

public class Ex8Volume {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double raio = 0.0;
		double altura = 0.0;
		final double PI = 3.14;
		
		System.out.println("Digite o raio:");
		raio = leia.nextDouble();
		System.out.println("Digite a altura:");
		altura =  leia.nextDouble();
		
		double volume = PI * (raio * raio) * altura;
		
		System.out.println("Volume da lata = " + volume);
		
		leia.close();
	}

}
