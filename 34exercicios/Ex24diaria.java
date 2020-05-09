package exercicios1;

import java.util.Scanner;

public class Ex24diaria {public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);

	int diaria = 0;

	System.out.println("Digite seu nome: ");
	String nome = leia.next();
	System.out.println("Numero de diárias: ");
	diaria = leia.nextInt();

	double valordiaria;
	valordiaria = diaria * 60;

	if (diaria > 15) {
		valordiaria += diaria * 5.50;
	} else if (diaria == 15) {
		valordiaria += diaria * 6;
	} else if (diaria < 15) {
		valordiaria += diaria * 8;
	}

	System.out.println(nome + ", o valor total da diaria é de: " + valordiaria);

	leia.close();
}

}
