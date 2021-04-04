import javax.swing.JOptionPane;

/* Crie um algoritmo que receba e apresente os seguintes dados: Nome, endereço, produto;
• Formatação de saída: O cliente <nome> solicitou o produto <produto> para o endereço <endereço> */

public class Ativ06 {
	public static void main (String [] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		String endereco = JOptionPane.showInputDialog("Digite o seu endereço");
		String produto = JOptionPane.showInputDialog("Digite o nome do produto");
		
		JOptionPane.showMessageDialog(null, "O cliente " +nome+ " solicitou o produto " +produto +" para o endereço "+ endereco);
	}

}
