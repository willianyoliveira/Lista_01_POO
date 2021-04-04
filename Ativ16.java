import javax.swing.JOptionPane;

/* Faça um algoritmo que recebe a média e
retorna se o aluno tá aprovado ou reprovado;
• Formatação de saída: O aluno foi <resposta> */

public class Ativ16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float media = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota: "));
		if (media<7) {
			JOptionPane.showMessageDialog(null, "Reprovado");
		}else {
			JOptionPane.showMessageDialog(null, "Aprovado");		
		}
	}

}
