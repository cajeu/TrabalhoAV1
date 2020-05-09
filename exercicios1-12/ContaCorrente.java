package trabalhoav1;

public class ContaCorrente {
	int conta;
	int agencia;
	double saldo;
	String nomeCliente;

	public int sacar(double valors) {
		if (valors <= this.saldo) {
			this.saldo -=valors;
			return 1;
		} else {
			return 0;
		}
	}
	
	public void deposito(double valord) {
		this.saldo += valord;		
	}
	
	public void imprimir() {
		System.out.println("Conta: " + this.conta);
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Nome do Cliente: " + this.nomeCliente);
	}

}
