import javax.swing.JOptionPane;

/*Escreva um algoritmo que receba dois valores
e retorne a divisão;
• Formatação de saída: A divisão de
<variavel01> por <variavel02> é <resultado> */
public class Ativ11 {
	public static void main(String[] args) {

		float num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		float num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
		float div = num1 / num2;
		JOptionPane.showMessageDialog(null, "A divisão entre os números " + num1 + " e " + num2 + " é igual a " + div);

	}

}
