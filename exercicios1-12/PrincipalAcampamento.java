package trabalhoav1;

public class PrincipalAcampamento {
	public static void main(String[] args) {
		Acampamento aca = new Acampamento();

		aca.nome = "Edson";
		aca.idade = 17;

		System.out.println("Imprimir dados:");
		aca.imprimir();
		aca.separarGrupo();
		System.out.println();
		System.out.println("Imprimindo dados depois das equipes separadas:");
		aca.imprimir();
	}

}
