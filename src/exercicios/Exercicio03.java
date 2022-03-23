package exercicios;

public class Exercicio03 {

	public static void main(String[] args) {
		double mercadoria = 280.0;
		
		double desconto = mercadoria * 0.15;
		
		double total = mercadoria - desconto;
		
		System.out.println("Valor da mercadoria R$: " + mercadoria);
		System.out.println("Desconto R$: "+ desconto);
		System.out.println("Total R$: " + total);

	}

}
