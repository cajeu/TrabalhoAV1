package exercicios1;

import java.util.Scanner;

public class Ex5Salario {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double ht = 0.0;
		double vh = 0.0;
		double pd = 0.0;

		System.out.println("Digite as horas trabalhadas no mês:");
		ht = leia.nextDouble();
		System.out.println("Digite o valor das horas:");
		vh = leia.nextDouble();
		System.out.println("Digite o percentual de desconto");
		pd = leia.nextDouble();

		double sb = ht * vh;
		double td = (pd / 100) * sb;
		double sl = sb - td;

		System.out.println("Horas trabalhadas = " + ht);
		System.out.println("Salario bruto = " + sb);
		System.out.println("Desconto = " + td);
		System.out.println("Salario Liquido = " + sl);

		leia.close();
	}

}
