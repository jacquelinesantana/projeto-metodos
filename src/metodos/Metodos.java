package metodos;

public class Metodos {
	//metodo void apenas exibe na tela 
	public static void lucas() {
		System.out.println("Ol� Lucas");
	}
	/*
	 * m�todo com retorno void - sem retorno apenas exibe na tela
	public static void somar(int num1, int num2) {
		System.out.println(num1 + num2);
	}*/
	
	//metodo com retorno do tipo inteiro chamnado somar com 3 argumentos
	public static int somar(int num1, int num2, String nome) {
		return num1 + num2;
		//retorno do tipo int/long/ float / double entre outros tipos num�ricos n�o pode ter "" string junto
	}
	
	//assinatura do m�todo � o tipo de saida, nome e argumentos que ele possui 
	public static String falar(String profissao, int idade) {
		return "A  Paloma tem "+ idade+  " anos e j� �: " + profissao;
		//retorno do tipo string pode conter numeros
	}
	
	
}
