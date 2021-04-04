import javax.swing.JOptionPane;

/*fAÇA UM ALGORITIMO QUE RECEBE O NOME DO ALUNO E DUAS NOTAS E RETORNA A MÉDIA:
FORMATAÇÃO DE SAÍDA: o ALUNO <ALUNO> OBTEVE MÉDIA: <MEDIA>
 */
public class Ativ12 {
	public static void main (String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		float nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota: "));
		float nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota: "));
		float media = (nota1 + nota2)/2;
		JOptionPane.showMessageDialog(null, "A média do aluno "+nome+ " foi igual a: " +media);
	}

}
