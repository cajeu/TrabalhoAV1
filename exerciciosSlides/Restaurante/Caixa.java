package exercicioprato;

public class Caixa {
	private Prato vet[] = new Prato[10];
	private int contador = 0;
	
	
	public void adicionarPrato (Prato pra) {
		this.vet[contador] = pra;
		this.contador++;
	}
	
	public double fecharPedido() {
		double total = 0.0;
		for (int i = 0; i< contador; i++) {
			total = total + vet[i].getValor();
			System.out.println(this.vet[i]);
		}
		return total;
	}

}
