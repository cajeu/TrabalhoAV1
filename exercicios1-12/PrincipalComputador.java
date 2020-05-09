package trabalhoav1;

public class PrincipalComputador {
	public static void main(String[] args) {
		Computador comp = new Computador();		
		comp.marca = "HP";
		comp.cor = "Branco";
		comp.modelo = "aaa1";
		comp.numeroSerie = 123456;
		comp.preco = 2000;
		
		System.out.println("Imprimindo dados");
		comp.imprimir();
		comp.calcularValor();
		System.out.println();
		System.out.println("Imprindo dados depois de calcular valor");
		comp.imprimir();
		
		Computador comp2 = new Computador();
		comp2.marca = "IBM";
		comp2.cor = "Preto";
		comp2.modelo = "bbb2";
		comp2.numeroSerie = 654321;
		comp2.preco = 1000;
		
		System.out.println("Imprimindo dados");
		comp2.imprimir();
		comp2.calcularValor();
		System.out.println();
		System.out.println("Imprindo dados depois de calcular valor");
		comp2.imprimir();
		System.out.println();
		if (comp2.alterarValor(2000) == 1) {
			System.out.println("Valor Alterado");
		}else {
			System.out.println("Valor Nao alterado");
		}
		
		if (comp2.alterarValor(-10) == 1) {
			System.out.println("Valor Alterado");
		}else {
			System.out.println("Valor Nao alterado");
		}
		System.out.println();
		System.out.println("Imprimindo dados depois do valor alterado");
		comp2.imprimir();
		
	}

}
