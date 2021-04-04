import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*Faça um algoritmo que recebe o salario de 3
funcionários e retorne a média;
• Formatação de saída: O salario médio da
empresa é <media>*/

public class Ativ19 {
	public static void main(String[]args) {
		double arearetangulo = 0;
			area retangulo = new area();
			retangulo.altura= Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do retangulo:  "));
			retangulo.largura= Float.parseFloat(JOptionPane.showInputDialog("Digite a largura do retangulo:  "));
			arearetangulo = ((retangulo.altura) * (retangulo.largura));
		
		JOptionPane.showMessageDialog(null,"A área do retangulo: " + new DecimalFormat ("#,##0.00").format(arearetangulo)+ "m");
}
}

class area{
	double altura, largura;

}