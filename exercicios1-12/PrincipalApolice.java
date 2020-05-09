package trabalhoav1;

public class PrincipalApolice {
	public static void main(String[] args) {
		Apolice novoObj = new Apolice();
		novoObj.idade = 23;
		novoObj.nomeSegurado = "Julia Cajeu";
		novoObj.valorPremio = 500;
		
		System.out.println("Imprimindo dados:");
		novoObj.imprimir();
		novoObj.calcularPremioApolice();
		System.out.println();
		System.out.println("Imprimindo dados após calculo do premio:");
		novoObj.imprimir();
		System.out.println();
		novoObj.oferecerDesconto("Curitiba");
		System.out.println("Imprimindo dados após desconto:");
		novoObj.imprimir();
		
	}
}
