package fabricaBebida;

public class Refrigerante extends Bebida{

	private int acucar;
	private String sabor;
	
	Refrigerante(String recebeSabor, int recebeAcucar, int recebeVolumeAgua, String recebeNome) {
		super(recebeVolumeAgua, recebeNome);
		this.setSabor(recebeSabor);
		this.setAcucar(recebeVolumeAgua);
	}
	

	public int getAcucar() {
		return acucar;
	}
	public void setAcucar(int acucar) {
		this.acucar = acucar;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	
}
