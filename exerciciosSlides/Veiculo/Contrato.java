package exercicioCarro;

import java.util.Date;

public class Contrato {
	private Veiculo vet[] = new Veiculo[4];
	private int contador = 0;
	private Date dataInicio;
	private Date dataFim;

	public Contrato() {
		super();
		this.dataInicio = new Date();
	}

	public void adicionarVeiculo(Veiculo veic) {
		this.vet[contador] = veic;
		this.contador++;
	}

	public double fecharContrato() {
		System.out.println("Data Inicio contrato " + this.dataInicio);
		double total = 0.0;
		for (int i = 0; i < contador; i++) {
			total = total + vet[i].getValor();
			System.out.println(this.vet[i]);
		}
		this.dataFim = new Date();
		System.out.println("Data Fim do contrato " + this.dataFim);
		return total;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

}
