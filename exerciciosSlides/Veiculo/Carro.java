package exercicioCarro;

public class Carro extends Veiculo {

	private boolean eAutomatica;
	private String categoria;
	public boolean iseAutomatica() {
		return eAutomatica;
	}
	public void seteAutomatica(boolean eAutomatica) {
		this.eAutomatica = eAutomatica;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Carro [eAutomatica=" + eAutomatica + ", categoria=" + categoria + "]";
	}
	

}
