/* Crie um algoritmo que apresente os seguintes dados:
• Nome, sexo, idade, estado civil, salario;
• Formatação de saída: Funcionário <nome> do sexo
<sexo> idade <idade> e estado civil <estado civil>
recebe <salario> de salario; */
public class Ativ04 {
	public static void main (String[] args) {
		String nome = ("Willy");
		String estCivil = ("solteira");
		String sexo = ("feminino");
		int idade = 22;
		float salario = 1234.56f;
		
		System.out.printf ("Funcionário %s, do sexo %s, idade %d e estado civil %s, recebe %.2f de salário",nome, sexo, idade, estCivil, salario);
		
	}
}
