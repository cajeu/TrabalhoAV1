package exercicioCamiseta;

public class Sapato extends Vestuario{
	private boolean eCouro;

	public boolean iseCouro() {
		return eCouro;
	}

	public void seteCouro(boolean eCouro) {
		this.eCouro = eCouro;
	}

	@Override
	public String toString() {
		return super.toString() + "Sapato [eCouro=" + eCouro + "]";
	}
	

}
