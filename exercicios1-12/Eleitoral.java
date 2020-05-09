package trabalhoav1;

public class Eleitoral {
	String nome;
	int idade;

	public void verificar() {
		if (this.idade < 16) {
			System.out.println("Eleitor nao pode votar");
		}
		if ((this.idade >= 16) && (this.idade <= 65)) {
			System.out.println("Eleitor deve votar");
		}
		if (this.idade > 65) {
			System.out.println("Voto facultativo");
		}
	}
	
	public void imprimir() {
		System.out.println("Nome: "+ nome);
		System.out.println("Idade: " + idade);
		verificar();
	}

}
