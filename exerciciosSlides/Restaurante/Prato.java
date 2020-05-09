package exercicioprato;

public class Prato {
	
	private String bebida;
	private String sobremesa;
	private String porcao; //porção de batata etc adicionais
	private double valor;
	public String getBebida() {
		return bebida;
	}
	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	public String getSobremesa() {
		return sobremesa;
	}
	public void setSobremesa(String sobremesa) {
		this.sobremesa = sobremesa;
	}
	public String getPorcao() {
		return porcao;
	}
	public void setPorcao(String porcao) {
		this.porcao = porcao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Prato [bebida=" + bebida + ", sobremesa=" + sobremesa + ", porcao=" + porcao + ", valor=" + valor + "]";
	}
	
	

	

}
