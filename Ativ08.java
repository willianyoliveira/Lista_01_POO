import javax.swing.JOptionPane;

/*Escreva um algoritmo que receba dois valores
e retorne a soma;
• Formatação de saída: A soma de <variavel01>
com <variavel02> é <resultado>*/

public class Ativ08 {
	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
		int soma = num1 + num2;
		JOptionPane.showMessageDialog(null, "A soma entre os números " + num1 + " e " + num2 + " é igual a " + soma);

	}
}
