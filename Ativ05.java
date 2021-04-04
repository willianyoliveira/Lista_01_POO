/*Crie um algoritmo que receba e apresente os
seguintes dados: Nome, cpf, sexo, idade
• Formatação da saída: A aluno <nome> com
cpf <cpf> do sexo <sexo> tem <idade> anos;*/
import javax.swing.JOptionPane;

public class Ativ05 {

		public static void main (String[] args) {
			String nome = JOptionPane.showInputDialog("Digite o seu nome");
			String cpf = JOptionPane.showInputDialog("Digite o seu cpf");
			String sexo = JOptionPane.showInputDialog("Digite o 'M' para masculino e 'F' para feminino");
			if (sexo == "M") {
				sexo = "masculino"; 
			} else {
				sexo = "feminino";
			}
			
			String idade = JOptionPane.showInputDialog ("Digite a sua idade");
			
			JOptionPane.showMessageDialog(null, "A aluna "+nome+ ", com cpf: "+cpf+", do sexo "+sexo+", tem "+idade+" anos");
			
		}
}
