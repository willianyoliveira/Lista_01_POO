import javax.swing.JOptionPane;

/*Faça um algoritmo que recebe a temperatura
de dois dias e retorna se vai chover ou não
seguindo a tabela: */

public class Ativ17 {
	public static void main(String[] args) {
	float dia1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura do primeiro dia: "));
	float dia2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura do segundo dia: "));
	if((dia1>20)&&(dia2>20)){
		JOptionPane.showMessageDialog(null, "Vai chover");
	}else if((dia1<20)&&(dia2>20))
	{
		JOptionPane.showMessageDialog(null, "Não vai chover");
	}else if((dia1>20) && (dia2<20))
	{
		JOptionPane.showMessageDialog(null, "Vai chover");
	}else
	{
		JOptionPane.showMessageDialog(null, "Vai chover");
	}
}}
