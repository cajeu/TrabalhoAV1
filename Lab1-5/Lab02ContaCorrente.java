package view;

public class Lab02ContaCorrente {
	int numAge;
	int numConta;
	String nome;
	double saldo;

	public double sacar(double pValor) {

		if (pValor < this.saldo) {
			this.saldo = this.saldo - pValor;
			return 1;
		} else {
			return 0;
		}
	}

	public void depositar(double pValor) {
		this.saldo = this.saldo + pValor;
		System.out.println("valor atual: " + this.saldo);

	}
	
	public void Imprimir() {
		System.out.println("Numero da Agencia: " + this.numAge);
		System.out.println("Numero da Conta: " + this.numConta);
		System.out.println("Nome do Cliente: " + this.nome);
		System.out.println("Saldo: " + this.saldo);
	}

	public int getNumAge() {
		return numAge;
	}

	public void setNumAge(int numAge) {
		this.numAge = numAge;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Lab02ContaCorrente [numAge=" + numAge + ", numConta=" + numConta + ", nome=" + nome + ", saldo=" + saldo
				+ ", getNumAge()=" + getNumAge() + ", getNumConta()=" + getNumConta() + ", getNome()=" + getNome()
				+ ", getSaldo()=" + getSaldo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
