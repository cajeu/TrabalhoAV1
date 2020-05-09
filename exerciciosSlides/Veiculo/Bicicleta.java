package exercicioCarro;

public class Bicicleta extends Veiculo {
	private int raioAro;
	private String tpfreio;
	private String tpmarcha;
	
	public int getRaio() {
		return raioAro;
	}
	public void setRaio(int raioAro) {
		this.raioAro = raioAro;
	}
	public String getTpfreio() {
		return tpfreio;
	}
	public void setTpfreio(String tpfreio) {
		this.tpfreio = tpfreio;
	}
	public String getTpmarcha() {
		return tpmarcha;
	}
	public void setTpmarcha(String tpmarcha) {
		this.tpmarcha = tpmarcha;
	}
	
	@Override
	public String toString() {
		return "Bicicleta [raioAro=" + raioAro + ", tpfreio=" + tpfreio + ", tpmarcha=" + tpmarcha + "]";
	}

}
