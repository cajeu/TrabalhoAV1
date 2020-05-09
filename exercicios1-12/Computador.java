package trabalhoav1;

public class Computador {
	String marca;
	String cor;
	String modelo;
	int numeroSerie;
	double preco;

	public void imprimir() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Numero de Serie: " + this.numeroSerie);
		System.out.println("Preço: " + preco);
	}

	public void calcularValor() {
		if (this.marca.equals("HP")) {
			this.preco += (this.preco * 30) / 100;
		}
		if (this.marca.equals("IBM")) {
			this.preco += (this.preco * 50) / 100;
		}
	}

	public int alterarValor(double valor) {
		if (valor > 0) {
			this.preco = valor;
			return 1;
		} else {
			return 0;
		}
	}

}
