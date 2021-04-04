import javax.swing.JOptionPane;

/* Faça um algoritmo que recebe a idade e
retorne se a pessoa tá no grupo de
risco(acima de 40 anos);*/

public class Ativ18 {
	public static void main (String[]args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		if (idade>40) {
			JOptionPane.showMessageDialog(null, "Você faz parte do Grupo de risco");
		}else {
			JOptionPane.showMessageDialog(null, "VOcê não está no grupo de risco");
		}
	}
}
