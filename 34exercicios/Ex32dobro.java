package exercicios1;

import java.util.Scanner;

public class Ex32dobro {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int primeiro[] = new int[4];
		int segundo[] = new int[4];
		int dobro[] = new int[8];
		int i = 0;

		for ( i = 0; i < primeiro.length; i++) {
			primeiro[i] = (int)(Math.random() *10);
		}
		for ( i = 0; i < segundo.length; i++) {
			segundo[i] = (int)(Math.random() *10);
		}
		
		for (i =0; i < primeiro.length; i++) {
			dobro[i] = primeiro[i];
			dobro[i+4] = segundo[i];
		}
		
		for ( i = 0; i < dobro.length; i++) {
			System.out.println(dobro[i]);
		}

		leia.close();
	}

}
