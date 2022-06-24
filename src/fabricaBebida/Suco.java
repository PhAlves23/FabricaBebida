package fabricaBebida;

public class Suco extends Bebida {

	private String poupaSuco;

	Suco(int recebeVolumeAgua, String recebeNome, String recebePoupaSuco) {
		super(recebeVolumeAgua, recebeNome);
		this.setPoupaSuco(recebePoupaSuco);
	}

	public String getPoupaSuco() {
		return poupaSuco;
	}

	public void setPoupaSuco(String poupaSuco) {
		this.poupaSuco = poupaSuco;
	}

	public void mostrarObjetoSuco() {
		System.out.println("O tipo da poupa do suco é " + this.getPoupaSuco() + "\nO nome do suco é " + this.getNome()
				+ "\nO volume de água para esse suco é " + this.getVolumeAgua());
	}

}
