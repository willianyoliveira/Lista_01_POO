import javax.swing.JOptionPane;

/* Escreva um algoritmo que receba dois valores
e retorne a subtração;
• Formatação de saída: A subtração de
<variavel01> com <variavel02> é <resultado>*/ 

public class Ativ09 {
	public static void main (String [] args) {
		
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
		int soma = num1 - num2;
		JOptionPane.showMessageDialog(null, "A subtração entre os números " +num1+ " e " +num2+ " é igual a " +soma);
		
		
		
	}
}
