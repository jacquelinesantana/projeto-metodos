package metodos;

public class TestandoMetodos {
	/*
	public static void xuxa() {
		System.out.println("Ol� mundo, V�nia!");
		
	}
	public static void tudo() {
		System.out.println("Tudo bem?");
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*xuxa();
		xuxa();
		tudo();*/
		
		int contador = 15 + 5 ;
		//chamando um m�todo declarado na classe Metodos - quando o m�todo � static
		Metodos.lucas();
		Metodos.lucas();
		Metodos.lucas();
		
		//chamando um m�todo declarado na classe Metodos passando argumentos
		Metodos.somar(1, 7,"Carol");
		int resultadoMetodo = Metodos.somar(1, 7, "Carol");
		
		int resultado = resultadoMetodo * 2;
		
		System.out.println(resultado);
		
		//m�todo com retorno pode ser manipulado e ter seu retorno processado
		System.out.println(Metodos.falar("Dev Full Stack", 18) + " e ela � muito boa!");
		
		System.out.println(Metodos.falar("Front end", 19) + " e ela � muito boa!");
		
		
	}
	

}
