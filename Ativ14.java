import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*Faça um algoritmo que recebe o salario de 3
funcionários e retorne a média;
• Formatação de saída: O salario médio da
empresa é <media>*/

public class Ativ14 {
	public static void main(String[]args) {
		double soma = 0;

		int cont = 0;
		for (int i=1; i<=3; i++) {
			Func funcionario = new Func();
			cont = cont + 1;
			funcionario.salario= Float.parseFloat(JOptionPane.showInputDialog("Digite o " + cont + " salario: "));
			
			soma = funcionario.salario + soma;
		
		}
		double media = soma/cont;
		
		JOptionPane.showMessageDialog(null,"A média dos salários é igual a: " + new DecimalFormat("#,##0.00").format(media));
}
}

class Func {
	double salario;

}