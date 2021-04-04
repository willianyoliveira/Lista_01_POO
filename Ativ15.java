import javax.swing.JOptionPane;

/*Faça um algoritmo que recebe o salario e
aplica a regra de educação financeira 50%-
30%-20%;
• Formatação de saída: O seu salário é
<salario>. Você deve usar <valor> para as
necessidades. Deve usar <valor2> para seus
desejos pessoais. E <valor3> para
investimento ou pagar as dívidas; */

public class Ativ15 {
	public  static void main (String [] args) {
		double salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu salário: "));
		double valor1 = salario-(salario*0.5);
		double valor2 = salario*0.3;
		double valor3 = salario*0.2;
		JOptionPane.showMessageDialog(null, "O seu salário é "+ salario + " Você deve usar " + valor1 + "para as necessidades." + " Deve usar " + valor2 + " para seus desejos pessoais. E "+valor3+ " para investimento ou pagar as dívidas;");
		
		
	}
}
