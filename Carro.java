
public class Carro {

	float acelerar, frear, ligar, desligar, velocidade;
	
	void ligar () {
			 System.out.printf("Você ligou o carro\n\n");	
	}

	
	void frear(float valor) {
		
		velocidade = velocidade - valor;
		System.out.printf("você reduziu a velocidade, está a %.1fKM/h\n\n", velocidade);
	}
	
	void acelerar (float valor) {
		
		velocidade = velocidade + valor;
		System.out.printf("você aumentou a velocidade, está a %.1fKM/h\n\n", velocidade);
				
	}
	
	void desligar () {
		System.out.printf("Você desligou o carro \n\n");
	}
}

