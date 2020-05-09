package exercicios1;

import java.util.Scanner;

public class Ex2triangulo {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double area = 0.0;
		double altura = 0.0;
		double base = 0.0;
		
		System.out.println("Insira o valor da base do triangulo:");
		base = leia.nextDouble();
		System.out.println("Insira o valor da altura do triangulo");
		altura = leia.nextDouble();
		
		area = (base * altura)/2;
		
		System.out.println("Area do triangulo = " + area);
		
		leia.close();
	}

}
