package exercicios1;

import java.util.Scanner;

public class Ex34SomaMatriz {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int matriz1[][] = new int[4][4];
		int matriz2[][] = new int[4][4];
		int matriz3[][] = new int[4][4];
		int i = 0;
		int j =0;
		
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				matriz1[i][j] = (int) (Math.random() * 10);
			}
		}
		
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				matriz2[i][j] = (int) (Math.random() * 10);
			}
		}
		
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
			
			}
		}
		
		System.out.println("Primeira matriz -------------------------------");
		for (i =0; i < 4; i++) {
			System.out.println( matriz1[i][0] + "\t" + matriz1[i][1] + "\t" + matriz1[i][2] + "\t" + matriz1[i][3]);
		}
		
		System.out.println("Segunda matriz -------------------------------");
		for (i =0; i < 4; i++) {
			System.out.println( matriz2[i][0] + "\t" + matriz2[i][1] + "\t" + matriz2[i][2] + "\t" + matriz2[i][3]);
		}
		
		System.out.println("Soma das matrizes -------------------------------");		
		for (i =0; i < 4; i++) {
			System.out.println( matriz3[i][0] + "\t" + matriz3[i][1] + "\t" + matriz3[i][2] + "\t" + matriz3[i][3]);
		}
	

		leia.close();
	}
}
