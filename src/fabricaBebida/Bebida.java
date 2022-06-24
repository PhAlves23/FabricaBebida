package fabricaBebida;

public class Bebida {

	private int volumeAgua;
	private String nome;
	
	public Bebida(int recebeVolumeAgua, String recebeNome) {
		this.setVolumeAgua(recebeVolumeAgua);
		this.setNome(recebeNome);
	}
	
	public int getVolumeAgua() {
		return volumeAgua;
	}
	public void setVolumeAgua(int volumeAgua) {
		this.volumeAgua = volumeAgua;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
