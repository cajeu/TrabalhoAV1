package exercicios1;

import java.util.Scanner;

public class Ex27tabuada {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int tab;
		int i = 0;

		for (i = 0; i < 11; i++) {
			tab = 13 * i;
			System.out.println(tab);
		}

		leia.close();
	}

}
