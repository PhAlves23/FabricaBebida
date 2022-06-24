package fabricaBebida;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		
		mostrarMenu();//Depois pode criar um menu aqui para pedir para a pessoa digitar 1 para refri ou 2 para suco

		String recebeSaborRefrigerante = JOptionPane.showInputDialog("Digite o sabor do refrigerante");
		int recebeAcucarRefrigerante = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de açucar"));
		int recebeVolumeAguaRefrigerante = Integer.parseInt(JOptionPane.showInputDialog("Digite o volume de água"));
		String recebeNomeRefrigerante = JOptionPane.showInputDialog("Digite o nome do refrigerante");

		Refrigerante refrigerante;
		refrigerante = new Refrigerante(recebeSaborRefrigerante, recebeAcucarRefrigerante, recebeVolumeAguaRefrigerante, recebeNomeRefrigerante);

		System.out.println("O sabor do refrigerante é " + refrigerante.getSabor() +
				"\nA quantidade de açucar do refrigerante é " + refrigerante.getAcucar() +
				"\nO volume de água do refrigerante é " + refrigerante.getVolumeAgua() + " mls" +
				"\nO nome do refrigerante é " + refrigerante.getNome());
		
			//Instanciar o objeto Suco
		
			int recebeVolumeAguaSuco = Integer.parseInt(JOptionPane.showInputDialog("Digite o volume de água do suco"));
			String recebeNomeSuco = JOptionPane.showInputDialog("Digite o nome do suco");
			String recebePoupaSuco = JOptionPane.showInputDialog("Digite o nome da poupa");
			
			Suco suco;
			suco = new Suco(recebeVolumeAguaRefrigerante, recebeNomeSuco, recebePoupaSuco);
			suco.mostrarObjetoSuco();
		}
	
	public static void mostrarMenu() {
		System.out.println("Oi");
	}
}


