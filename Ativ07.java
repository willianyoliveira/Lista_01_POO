import javax.swing.JOptionPane;

/*Crie um algoritmo que receba e apresente os
seguintes dados:
• Nome, sexo, idade, estado civil, salario;
• Formatação de saída: Funcionário <nome> do sexo
<sexo> idade <idade> e estado civil <estado civil>
recebe <salario> de salario;*/

public class Ativ07 {
	public static void main (String [] args) {
		float salario;
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		String sexo = JOptionPane.showInputDialog("Digite o 'M' para masculino e 'F' para feminino");
		if (sexo == "M") {
			sexo = "masculino"; 
		} else {
			sexo = "feminino";
		}
		
		String estCivil = JOptionPane.showInputDialog("Digite o seu estado civil: ");
		salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu salario atual: "));
		JOptionPane.showMessageDialog(null, "Funcionário: "+nome+" do sexo "+sexo+" e estado civil "+ estCivil+ " recebe "+salario);
		
		
		
	}
}
