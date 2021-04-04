/*Crie um algoritmo que apresente os seguintes dados:
Nome, número da conta, saldo da conta;
• Formatação de saída: O cliente <nome> da conta
<número da conta> tem o saldo de <saldo> */

public class Ativ01 {
	public static void main(String[] args) {
		
		String nome = "Williany Santana de Oliveira";
		String numConta = "010203-04";
		float saldo = 1234.5f;
		
		System.out.printf("A cliente %s dona da conta %s, tem o saldo igual a %.2f", nome, numConta, saldo);
	}

}

