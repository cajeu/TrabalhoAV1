package exercicioCamiseta;

public class Carrinho {
	
	public final int TOTAL = 50;
	private Vestuario vetorVestuario[] = new Vestuario[TOTAL];
	private int controleVestuario = 0;
	
	public void adicionarVestuario(Vestuario c) {
		vetorVestuario[controleVestuario]=c;
		controleVestuario++;
	}
	
	public double fecharPedidoVestuario() {
		double tot = 0.0;
		for (int i = 0; i < controleVestuario; i++) {
			tot = tot + vetorVestuario[i].getValor();
			System.out.println(vetorVestuario[i].toString());
		}
		return tot; 
	}

}
