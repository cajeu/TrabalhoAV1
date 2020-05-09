package exercicios1;

import java.util.Scanner;

public class Ex18DataInv {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int data1 = 0;

		System.out.println("Digite a data no formato DDMMAA:");
		data1 = leia.nextInt();

		int dd = data1 / 10000;
		data1 -= (dd * 10000);
		int mm = data1 / 100;
		data1 -= (mm * 100);
		int aa = data1;
		if (mm < 10) {
			aa *= 10;
		}
		
		System.out.println("AAMMDD: " + aa + mm + dd);

		leia.close();
	}

}
